package com.teamelemental.forgeoffortune.item;

import com.teamelemental.forgeoffortune.ForgeOfFortune;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ForgeOfFortune.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab FOF_TAB;

    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        FOF_TAB = event.registerCreativeModeTab(new ResourceLocation(ForgeOfFortune.MOD_ID, "fof_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.BLINGOT.get()))
                    .title(Component.translatable("creativemodetab.fof_tab")));
    }
}
