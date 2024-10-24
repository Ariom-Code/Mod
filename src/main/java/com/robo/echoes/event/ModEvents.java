package com.robo.echoes.event;

import com.robo.echoes.Echoes;
import com.robo.echoes.entity.ModEntityTypes;
import com.robo.echoes.entity.custom.IllagerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = Echoes.MOD_ID)
    public static class ForgeEvents {
    }

    @Mod.EventBusSubscriber(modid = Echoes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.WILD_ILLAGER.get(), IllagerEntity.setAttributes());
        }
    }
}
