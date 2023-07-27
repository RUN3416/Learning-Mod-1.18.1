package net.noah.mccourse.mixin;

import net.minecraft.server.MinecraftServer;
import net.noah.mccourse.MCCourseMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		MCCourseMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}