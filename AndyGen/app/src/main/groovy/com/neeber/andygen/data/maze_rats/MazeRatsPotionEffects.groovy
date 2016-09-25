package com.neeber.andygen.data.maze_rats

import com.neeber.andygen.data.Shuffler
import com.neeber.andygen.data.AbstractGenerator

import javax.inject.Inject

class MazeRatsPotionEffects extends AbstractGenerator {
    static final List<String> effects = """
1-hour vampirism
Alter face
Alter voice
Animal-form
Anti-gravity
Anti-magic
Astral travel
Blink
Blurry outlines
Body-swap
Chamaeleon skin
Charm
Clairaudience
Clairvoyance
Command insects
Control animals
Control element
Contr. humanoids
Control plants
Control spirits
Control undead
Cure Disease
Cure Poison
Deafening voice
Detect evil
Detect gold
Detect magic
Detect secret doors
Detect undead
Direction Sense
Dream-walk
Element-form
Enhance all attacks
Expert artisan
Expert blacksmith
Expert cook
Expert engineer
Expert musician
Expert orator
Expert surgeon
Extra arm
Fire breathing
Flying
Frog tongue
Gain a tail
Gender swap
Growth
Haste
Heal stats
Heal Wounds
Hear thoughts
Heat vision
Identify magic
Immune to cold
Immune to heat
Immune to metal
Immune to poison
Invisibility
Invulnerability
Iron belly
Item-form
Jumping
Levitation
Mirror image
Never hungry
Never lost
Night vision
Nullify gravity
Panglottism
Pass as undead
Radiance
Random affliction
Random spell
Regeneration
Removes curse
Scorching gaze
Scry
Second sight
Sharp claws
Shrink
Slow
Speak with animals
Speak with dead
Speak w/elements
Speak with plants
Spider-climbing
Stretchy
Super strength
Telekinesis
Telepathy
Terror-presence
Throw Voice
Tongues
Too boring to see
True Sight
Truthsay
Water breathing
Water walking
Web-slinging
X-Ray vision
        """.readLines()

    @Inject
    MazeRatsPotionEffects(Shuffler shuffler) {
        super(shuffler);
    }

    List<GString> getFormatters() {
        return [
                "${ -> pick(effects)}",
        ]
    }

}
