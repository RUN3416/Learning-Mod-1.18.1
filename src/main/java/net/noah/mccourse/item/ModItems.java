package net.noah.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.noah.mccourse.MCCourseMod;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.noah.mccourse.block.ModBlocks;
import net.noah.mccourse.fluid.ModFluids;
import net.noah.mccourse.item.custom.*;
import net.noah.mccourse.sound.ModSounds;

public class ModItems {

    // INGOTS
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    // CUSTOM ITEM
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    // FOOD
    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)));

    // FUEL
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    // TOOLS
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
            new ModSlowingSwordItem(ModToolMaterial.ORICHALCUM, 5, 4f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel",
            new ModPaxelItem(ModToolMaterial.ORICHALCUM, 1, 1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ARMOR
    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // HORSE ARMOR
    public static final Item ORICHALCUM_HORSE_ARMOR = registerItem("orichalcum_horse_armor",
            new HorseArmorItem(15, "orichalcum",
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // DATA TABLET
    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxCount(1)));

    // TURNIP SEED
    public static final Item TURNIP_SEEDS = registerItem("turnip_seeds",
            new AliasedBlockItem(ModBlocks.TURNIP_CROP,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // MUSIC DISC
    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new ModMusicDiscItem(9, ModSounds.BAR_BRAWL,
                    new FabricItemSettings().group(ModItemGroups.COURSE).maxCount(1)));

    // ORICHALCUM STAFF
    public static final Item ORICHALCUM_STAFF = registerItem("orichalcum_staff",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).maxCount(1)));

    // ORICHALCUM BOW
    public static final Item ORICHALCUM_BOW = registerItem("orichalcum_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxCount(1)));

    // BUCKET OF HONEY
    public static final Item HONEY_BUCKET = registerItem("honey_bucket",
            new BucketItem(ModFluids.HONEY_STILL, new FabricItemSettings().group(ModItemGroups.COURSE).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }
}
