package com.blamejared.noshade.mixin;

import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Style;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Font.StringRenderOutput.class)
public class MixinStringRenderOutput {
    
    @Shadow
    @Final
    private boolean dropShadow;
    
    @Inject(method = "accept", at = @At(value = "HEAD"), cancellable = true)
    public void noshade$accept(int p_92967_, Style p_92968_, int p_92969_, CallbackInfoReturnable<Boolean> cir) {
        
        if(this.dropShadow) {
            cir.setReturnValue(false);
        }
    }
    
}
