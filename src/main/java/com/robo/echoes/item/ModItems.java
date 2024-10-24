package com.robo.echoes.item;

import com.robo.echoes.Echoes;
import com.robo.echoes.entity.ModEntityTypes;
import com.robo.echoes.item.custom.EyeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Echoes.MOD_ID);


    public static final RegistryObject<Item> CORRUPTED = ITEMS.register("corrupted",
            () -> new EyeItem(new Item.Properties().tab(ModCreativeModTab.ECHOES)));

    public static final RegistryObject<Item> ILLAGER_SPAWN_EGG = ITEMS.register("wild_illager_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WILD_ILLAGER, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModTab.ECHOES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
