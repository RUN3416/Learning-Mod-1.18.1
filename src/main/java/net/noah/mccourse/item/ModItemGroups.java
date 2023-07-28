package net.noah.mccourse.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.noah.mccourse.MCCourseMod;

public class ModItemGroups {
    public static final ItemGroup COURSE = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "course"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));
}
