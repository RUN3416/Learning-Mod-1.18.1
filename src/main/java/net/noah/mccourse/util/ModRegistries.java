package net.noah.mccourse.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import net.noah.mccourse.MCCourseMod;
import net.noah.mccourse.block.ModBlocks;
import net.noah.mccourse.command.ReturnHomeCommand;
import net.noah.mccourse.command.SetHomeCommand;
import net.noah.mccourse.event.ModPlayerEventCopyFrom;
import net.noah.mccourse.item.ModItems;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
        registerModComposterChances();
        registerCommands();
        registerEvents();
        registerStrippables();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);
    }

    private static void registerModComposterChances() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TURNIP_SEEDS, 0.55f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TURNIP, 0.85f);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_LOG, ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_WOOD, ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD);
    }
}
