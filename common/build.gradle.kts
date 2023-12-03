import com.blamejared.noshade.gradle.Properties
import com.blamejared.noshade.gradle.Versions

plugins {
    java
    id("org.spongepowered.gradle.vanilla") version "0.2.1-SNAPSHOT"
    id("com.blamejared.noshade.default")
}


minecraft {
    version(Versions.MINECRAFT)
    accessWideners(project.file("src/main/resources/${Properties.MODID}.accesswidener"))
}

dependencies {
    compileOnly("org.spongepowered:mixin:0.8.5")
//    compileOnly("org.ow2.asm:asm:9.6")
    compileOnly("org.ow2.asm:asm-tree:9.6")

}