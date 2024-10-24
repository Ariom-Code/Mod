package com.robo.echoes.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab ECHOES = new CreativeModeTab("echoestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CORRUPTED.get());
        }
    };
}
