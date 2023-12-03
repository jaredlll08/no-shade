package com.blamejared.noshade.mixin;

import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.util.FormattedCharSequence;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Font.class)
public class MixinFont {
    
    @Inject(method = "renderText(Ljava/lang/String;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/client/gui/Font$DisplayMode;II)F", at = @At(value = "HEAD"), cancellable = true)
    public void noshade$renderText(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, MultiBufferSource $$6, Font.DisplayMode $$7, int $$8, int $$9, CallbackInfoReturnable<Float> cir) {
        
        if($$4) {
            cir.setReturnValue(0f);
        }
    }
    
    @Inject(method = "renderText(Lnet/minecraft/util/FormattedCharSequence;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/client/gui/Font$DisplayMode;II)F", at = @At(value = "HEAD"), cancellable = true)
    public void noshade$renderText(FormattedCharSequence $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, MultiBufferSource $$6, Font.DisplayMode $$7, int $$8, int $$9, CallbackInfoReturnable<Float> cir) {
        
        if($$4) {
            cir.setReturnValue(0f);
        }
    }
    
}
