/*
 * Copyright (c) 2017 Steve Christensen
 *
 * This file is part of Adventuresmith.
 *
 * Adventuresmith is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Adventuresmith is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Adventuresmith.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.stevesea.adventuresmith

import android.content.SharedPreferences
import android.support.v7.widget.*
import android.text.Editable
import android.text.InputType
import android.view.*
import android.widget.*
import com.fasterxml.jackson.core.type.TypeReference
import com.google.common.base.Strings
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.*
import com.mikepenz.fastadapter.listeners.ClickEventHook
import com.mikepenz.fastadapter.utils.*
import org.jetbrains.anko.*
import org.stevesea.adventuresmith.core.*
import java.util.*

class GeneratorButton(val generator: Generator,
                      val sharedPreferences: SharedPreferences,
                      locale: Locale = Locale.US,
                      val meta : GeneratorMetaDto = generator.getMetadata(locale)) :
        AbstractItem<GeneratorButton, GeneratorButton.ViewHolder>(),
        AnkoLogger {
    init {
        withIdentifier(generator.getId().hashCode().toLong())
    }
    val name = meta.name


    fun getGeneratorConfig() : Map<String, String> {
        return getGeneratorConfig(generator.getId())
    }
    val SETTING_GENERATOR_CONFIG_PREFIX = "GeneratorConfig."
    private fun getGeneratorConfig(genId: String) : Map<String, String> {
        val str = sharedPreferences.getString(SETTING_GENERATOR_CONFIG_PREFIX + genId, "")
        if (Strings.isNullOrEmpty(str)) {
            return mapOf()
        } else {
            return AdventuresmithApp.objectReader.forType(object: TypeReference<Map<String, String>>(){}).readValue(str)
        }
    }
    private fun setGeneratorConfig(genId: String, value: Map<String, String>) {
        val str = AdventuresmithApp.objectWriter.writeValueAsString(value)
        sharedPreferences.edit()
                .putString(SETTING_GENERATOR_CONFIG_PREFIX + genId, str)
                .apply()
    }
    private fun showGenWizard(v: View, stepInd: Int, items: List<InputParamDto>, oldState: Map<String,String>, newState: MutableMap<String, String>) {
        val item = items.get(stepInd)
        val k = item.name
        // if entry is in newState, use it. Otherwise fall back to previous config. Otherwise fallback to default value
        val displayVal = newState.getOrElse(k) { oldState.getOrElse(k) {item.defaultValue}}
        val isFirstPage = stepInd == 0
        val isFinalPage = stepInd == items.size - 1
        with(v.context) {
            alert(R.string.generator_config) {
                customView {
                    verticalLayout {
                        textView {
                            backgroundColor = 0
                            text = Editable.Factory.getInstance().newEditable(item.helpText)
                        }
                        val curEdit = editText {
                            textColor = 0
                            hint = item.uiName
                            maxLines = 1
                            singleLine = true
                            inputType = if (item.numbersOnly) InputType.TYPE_CLASS_NUMBER else InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                            text = Editable.Factory.getInstance().newEditable(displayVal)
                        }
                        positiveButton(if (isFinalPage) "OK" else "Next") {
                            newState.put(k, curEdit.text.toString().trim())
                            info("new state: " + newState)
                            if (isFinalPage) {
                                setGeneratorConfig(generator.getId(), newState)
                            } else {
                                showGenWizard(v, stepInd+1, items, oldState, newState)
                            }
                        }
                        negativeButton("Prev") {
                            isEnabled = if (isFirstPage) false else true
                            if (!isFirstPage) {
                                newState.put(k, curEdit.text.toString().trim())
                                showGenWizard(v, stepInd - 1, items, oldState, newState)
                            }
                        }
                    }
                }
            }.show()
        }
    }

    fun showGeneratorConfigDialog(v: View) {
        val previousConfig = getGeneratorConfig(generator.getId())
        info("Previous config: " + previousConfig)
        showGenWizard(v, 0, meta.inputParams, previousConfig, mutableMapOf())
    }

    override fun getType(): Int {
        return R.id.btn_card
    }

    override fun getLayoutRes(): Int {
        return R.layout.button_grid_item
    }

    override fun bindView(holder: ViewHolder?, payloads: MutableList<Any?>?) {
        super.bindView(holder, payloads)

        holder!!.btnText.text = htmlStrToSpanned(name)

        if (meta.inputParams.isNotEmpty()) {
            holder.btnSettings.visibility = View.VISIBLE
            /*
            holder.btnSettings.setOnClickListener(object: View.OnClickListener {
                override fun onClick(v: View?) {
                    info("Button click!")
                    showGeneratorConfigDialog(v!!)
                }
            })
            */
        } else {
            holder.btnSettings.visibility = View.GONE
            /*
            holder.btnSettings.setOnClickListener(object: View.OnClickListener {
                override fun onClick(v: View?) {
                    debug("Ignored!")
                }
            })
            */
        }
    }

    class ViewHolder(v: View?) : RecyclerView.ViewHolder(v) {
        val btnText =  v!!.findViewById(R.id.btn_txt) as TextView
        val btnSettings = v!!.findViewById(R.id.btn_settings) as ImageView
    }

    override fun getFactory(): ViewHolderFactory<out ViewHolder> {
        return Factory
    }
    companion object Factory : ViewHolderFactory<ViewHolder> {
        override fun create(v: View?): ViewHolder {
            return ViewHolder(v)
        }
    }
}

