package com.blamejared.noshade.mixin;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.*;

import java.util.*;

public class MixinPlugin implements IMixinConfigPlugin {
    
    
    public boolean emojifulLoaded;
    
    @Override
    public void onLoad(String mixinPackage) {
        
        try {
            Class.forName("com.hrznstudio.emojiful.Constants", false, MixinPlugin.class.getClassLoader());
            emojifulLoaded = true;
        } catch(Exception ignored) {
        }
    }
    
    @Override
    public String getRefMapperConfig() {
        
        return null;
    }
    
    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if(mixinClassName.contains("compat.emojiful")) {
            return emojifulLoaded;
        }
        return true;
    }
    
    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
    
    }
    
    @Override
    public List<String> getMixins() {
        
        return null;
    }
    
    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    
    }
    
    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    
    }
    
}
