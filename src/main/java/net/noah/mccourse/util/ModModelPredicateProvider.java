package net.noah.mccourse.util;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.noah.mccourse.MCCourseMod;
import net.noah.mccourse.item.ModItems;
import net.minecraft.item.Item;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        FabricModelPredicateProviderRegistry.register(ModItems.DATA_TABLET, new Identifier(MCCourseMod.MOD_ID, "on"),
                ((stack, world, entity, seed) -> stack.hasNbt() ? 1f : 0f));

        registerBow(ModItems.ORICHALCUM_BOW);
    }

    private static void registerBow(Item bow) {
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });

        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}
