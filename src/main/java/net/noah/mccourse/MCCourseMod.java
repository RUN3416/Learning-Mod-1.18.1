package net.noah.mccourse;

import net.fabricmc.api.ModInitializer;

import net.noah.mccourse.block.ModBlocks;
import net.noah.mccourse.enchantment.ModEnchantments;
import net.noah.mccourse.item.ModItems;
import net.noah.mccourse.util.ModLootTableModifiers;
import net.noah.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {

	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEnchantments.registerModEnchantments();

		ModLootTableModifiers.modifyLootTables();

		ModRegistries.registerModStuffs();


	}

}