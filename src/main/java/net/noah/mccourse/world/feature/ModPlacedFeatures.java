package net.noah.mccourse.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.noah.mccourse.MCCourseMod;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> CHERRY_BLOSSOM_PLACED_KEY = registerKey("cherry_blossom_placed");


    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(MCCourseMod.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MCCourseMod.MOD_ID, name));
    }
}
