package net.noah.mccourse.item.custom;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.noah.mccourse.util.ModTags;

public class ModPaxelItem extends MiningToolItem {
    public ModPaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINEABLE, settings);
    }

}
