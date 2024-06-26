package net.noah.mccourse.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class SpeedyBlock extends Block {
    public SpeedyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if(world.isClient()) {
            if(hand == Hand.MAIN_HAND) {
                player.sendMessage(new LiteralText("CLIENT: This is THE CLIENT! MAIN HAND"), false);
            } else {
                player.sendMessage(new LiteralText("CLIENT: This is THE CLIENT! OFF HAND"), false);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        float chance = 0.35f;

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.SMOKE, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.SMOKE, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.SMOKE, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.SMOKE, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient()) {
            if(entity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
