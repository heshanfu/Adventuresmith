/*
 * Copyright (c) 2016 Steve Christensen
 *
 * This file is part of RPG-Boy 2000.
 *
 * RPG-Boy 2000 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RPG-Boy 2000 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RPG-Boy 2000.  If not, see <http://www.gnu.org/licenses/>.
 */


package org.stevesea.rpg_boy2000.data

import dagger.Module
import dagger.Provides
import groovy.transform.CompileStatic
import org.stevesea.rpg_boy2000.data.freebooters_on_the_frontier.FotFSpells
import org.stevesea.rpg_boy2000.data.freebooters_on_the_frontier.FotFTraits
import org.stevesea.rpg_boy2000.data.maze_rats.MazeRatsAfflictions
import org.stevesea.rpg_boy2000.data.maze_rats.MazeRatsCharacter
import org.stevesea.rpg_boy2000.data.maze_rats.MazeRatsItems
import org.stevesea.rpg_boy2000.data.maze_rats.MazeRatsMagic
import org.stevesea.rpg_boy2000.data.maze_rats.MazeRatsMonsters
import org.stevesea.rpg_boy2000.data.maze_rats.MazeRatsPotionEffects
import org.stevesea.rpg_boy2000.data.perilous_wilds.PwPlace
import org.stevesea.rpg_boy2000.data.perilous_wilds.PwRegion

import javax.inject.Singleton

@CompileStatic
@Module(
        injects = [Shuffler.class, RpgBoyData.class],
        complete = false,
        library = true
)
public class RpgBoyDataModule {

    @Provides @Singleton
    Random provideRandom() {
        return new Random();
    }

    // this seems dumb... but i don't know how else to do it right now
    @Provides
    List<AbstractGenerator> provideGenerators(PwPlace pwPlace, PwRegion pwRegion,
                                              FotFSpells fotFSpells, FotFTraits fotFTraits,
                                              MazeRatsAfflictions mazeRatsAfflictions, MazeRatsCharacter mazeRatsCharacter,
                                              MazeRatsItems mazeRatsItems, MazeRatsMagic mazeRatsMagic, MazeRatsMonsters mazeRatsMonsters,
                                              MazeRatsPotionEffects mazeRatsPotionEffects) {
        def result = []
        result.add(pwRegion)
        result.add(pwPlace)
        result.add(fotFTraits)
        result.add(fotFSpells)
        result.add(mazeRatsCharacter)
        result.add(mazeRatsMagic)
        result.add(mazeRatsItems)
        result.add(mazeRatsMonsters)
        result.add(mazeRatsAfflictions)
        result.add(mazeRatsPotionEffects)
        return result
    }
}