package net.noah.mccourse.util;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.noah.mccourse.MCCourseMod;
import net.noah.mccourse.item.ModItems;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        FabricModelPredicateProviderRegistry.register(ModItems.DATA_TABLET, new Identifier(MCCourseMod.MOD_ID, "on"),
                ((stack, world, entity, seed) -> stack.hasNbt() ? 1f : 0f));
    }
}
