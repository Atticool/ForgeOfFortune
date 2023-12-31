package com.teamelemental.forgeoffortune.item;

import com.teamelemental.forgeoffortune.ForgeOfFortune;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForgeOfFortune.MOD_ID);

    public static final RegistryObject<Item> BLINGOT = ITEMS.register("blingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BLINGUS = ITEMS.register("raw_blingus", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LONGEST_NAME = ITEMS.register("longest_name", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));
    }
}
