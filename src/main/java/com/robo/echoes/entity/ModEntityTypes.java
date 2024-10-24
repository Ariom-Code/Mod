package com.robo.echoes.entity;

import com.robo.echoes.Echoes;
import com.robo.echoes.entity.custom.IllagerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Echoes.MOD_ID);

    public static final RegistryObject<EntityType<IllagerEntity>> WILD_ILLAGER =
            ENTITY_TYPES.register("wild_illager",
                    () -> EntityType.Builder.of(IllagerEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(Echoes.MOD_ID, "wild_illager").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
