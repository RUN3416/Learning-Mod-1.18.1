package net.noah.mccourse.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class ToxicEnchantment extends Enchantment {
    public ToxicEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.world.isClient()) {
            ServerWorld world = ((ServerWorld) user.world);
            PlayerEntity player = ((PlayerEntity) user);
            BlockPos position = target.getBlockPos();
            LivingEntity victim = (LivingEntity) target;

            if(level == 1) {
                ((LivingEntity) target).addStatusEffect(new
                        StatusEffectInstance(StatusEffects.POISON, 200, 0, false, false, true), player);
            }

            if(level == 2) {
                ((LivingEntity) target).addStatusEffect(new
                        StatusEffectInstance(StatusEffects.POISON, 200, 7, false, false, true), player);
            }

            // Still Deciding if Too OP
            if(level == 3) {
                ((LivingEntity) target).addStatusEffect(new
                        StatusEffectInstance(StatusEffects.POISON, 200, 20, false, false, true), player);
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
