package net.noah.mccourse.sound;

import net.minecraft.client.sound.Sound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.noah.mccourse.MCCourseMod;


public class ModSounds {

    public static SoundEvent DOWSING_ROD_FOUND_ORE = registerSoundEvent("dowsing_rod_found_ore");
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MCCourseMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
