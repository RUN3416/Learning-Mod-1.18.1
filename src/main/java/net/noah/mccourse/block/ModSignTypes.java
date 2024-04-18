package net.noah.mccourse.block;

import net.minecraft.util.SignType;
import net.noah.mccourse.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType CHERRY_BLOSSOM =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry_blossom"));
}
