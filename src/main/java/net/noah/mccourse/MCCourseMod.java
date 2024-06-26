package net.noah.mccourse;

import net.fabricmc.api.ModInitializer;

import net.noah.mccourse.block.ModBlocks;
import net.noah.mccourse.block.entity.ModBlockEntities;
import net.noah.mccourse.enchantment.ModEnchantments;
import net.noah.mccourse.item.ModItems;
import net.noah.mccourse.painting.ModPaintings;
import net.noah.mccourse.recipe.ModRecipes;
import net.noah.mccourse.util.ModLootTableModifiers;
import net.noah.mccourse.util.ModRegistries;
import net.noah.mccourse.world.feature.ModConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {

	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerAllEntities();

		ModEnchantments.registerModEnchantments();

		ModLootTableModifiers.modifyLootTables();

		ModRecipes.register();

		ModRegistries.registerModStuffs();
		ModPaintings.registerPaintings();


	}

}