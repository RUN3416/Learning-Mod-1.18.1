package net.noah.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.noah.mccourse.MCCourseMod;
import net.noah.mccourse.block.custom.*;
import net.noah.mccourse.fluid.ModFluids;
import net.noah.mccourse.item.ModItemGroups;
import net.noah.mccourse.sound.ModSounds;

public class ModBlocks {

    // BLOCK
    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.COURSE);

    // ORES
    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.COURSE);

    public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    // SPEEDY BLOCK
    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    // STAIRS AND SLABS
    public static final Block ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs",
            new ModStairsBlock(ModBlocks.ORICHALCUM_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_SLAB = registerBlock("orichalcum_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    // BUTTONS AND PRESSURE PLATES
    public static final Block ORICHALCUM_BUTTON = registerBlock("orichalcum_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_PRESSURE_PLATE = registerBlock("orichalcum_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    // FENCES AND WALLS
    public static final Block ORICHALCUM_FENCE = registerBlock("orichalcum_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_FENCE_GATE = registerBlock("orichalcum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_WALL = registerBlock("orichalcum_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);

    // DOORS
    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroups.COURSE);

    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroups.COURSE);

    // LAMP
    public static final Block ORICHALCUM_LAMP = registerBlock("orichalcum_lamp",
            new OrichalcumLampBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()
                    .luminance((state) -> state.get(OrichalcumLampBlock.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.ORICHALCUM_SOUNDS)), ModItemGroups.COURSE);

    // TURNIP
    public static final Block TURNIP_CROP = registerBlockWithoutBlockItem("turnip_crop",
            new ModTurnipBlock(FabricBlockSettings.copy(Blocks.BEETROOTS)));

    // FLOWER
    public static final Block PINK_ROSE = registerBlock("pink_rose",
            new FlowerBlock(StatusEffects.GLOWING, 8, FabricBlockSettings.copy(Blocks.PINK_TULIP)), ModItemGroups.COURSE);

    // POTTED PICK ROSE
    public static final Block POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            new FlowerPotBlock(ModBlocks.PINK_ROSE, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM)));

    // BLASTER
    public static final Block ORICHALCUM_BLASTER = registerBlock("orichalcum_blaster",
            new OrichalcumBlasterBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroups.COURSE);

    // HONEY FLUID BLOCK
    public static final Block HONEY_FLUID_BLOCK = registerBlockWithoutBlockItem("honey_fluid_block",
            new ModFluidBlock(ModFluids.HONEY_STILL, FabricBlockSettings.of(Material.WATER)
                    .noCollision().nonOpaque().dropsNothing()));

    // WOOD
    public static final Block CHERRY_BLOSSOM_LOG = registerBlock("cherry_blossom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroups.COURSE);
    public static final Block CHERRY_BLOSSOM_WOOD = registerBlock("cherry_blossom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroups.COURSE);

    public static final Block STRIPPED_CHERRY_BLOSSOM_LOG = registerBlock("stripped_cherry_blossom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroups.COURSE);
    public static final Block STRIPPED_CHERRY_BLOSSOM_WOOD = registerBlock("stripped_cherry_blossom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroups.COURSE);

    public static final Block CHERRY_BLOSSOM_PLANKS = registerBlock("cherry_blossom_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroups.COURSE);


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + MCCourseMod.MOD_ID);
    }
}
