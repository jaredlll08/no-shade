package com.blamejared.noshade.mixin.compat.emojiful;

import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSink;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "com.hrznstudio.emojiful.render.EmojiFontRenderer$EmojiCharacterRenderer")
@Pseudo
public abstract class MixinEmojiCharacterRenderer implements FormattedCharSink {
    
    @Shadow(remap = false)
    @Final
    private boolean dropShadow;
    
    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "accept(ILnet/minecraft/network/chat/Style;I)Z", at = @At(value = "HEAD"), cancellable = true)
    public void noshade$emojiful$accept(int p_92967_, Style p_92968_, int p_92969_, CallbackInfoReturnable<Boolean> cir) {
        
        if(this.dropShadow) {
            cir.setReturnValue(false);
        }
    }
    
}
