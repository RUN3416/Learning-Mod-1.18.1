package net.noah.mccourse.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.noah.mccourse.MCCourseMod;

import java.util.concurrent.Flow;

public class ModFluids {

    public static final FlowableFluid HONEY_STILL = register("honey_still", new HoneyFluid.Still());
    public static final FlowableFluid HONEY_FLOWING = register("honey_flowing", new HoneyFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowablefluid) {
        return Registry.register(Registry.FLUID, new Identifier(MCCourseMod.MOD_ID, name), flowablefluid);
    }
}
