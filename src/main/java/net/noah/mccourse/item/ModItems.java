package net.noah.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.noah.mccourse.MCCourseMod;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.noah.mccourse.item.custom.DowsingRodItem;
import net.noah.mccourse.item.custom.ModAxeItem;
import net.noah.mccourse.item.custom.ModHoeItem;
import net.noah.mccourse.item.custom.ModPickaxeItem;

public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)));

    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new ModAxeItem(ModToolMaterial.ORICHALCUM, 3, 2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new ModHoeItem(ModToolMaterial.ORICHALCUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new SwordItem(ModToolMaterial.ORICHALCUM, 5, 4f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }
}
