package com.teamelemental.forgeoffortune.block;


import com.mojang.blaze3d.shaders.Uniform;
import com.teamelemental.forgeoffortune.ForgeOfFortune;
import com.teamelemental.forgeoffortune.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ForgeOfFortune.MOD_ID);

    public static final RegistryObject<Block> BLINGUS_ORE = registerBlock("blingus_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_BLINGUS_ORE = registerBlock("deepslate_blingus_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> BLINGUS_BLOCK = registerBlock("blingus_block",() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BLINGUS_LOG = registerBlock("blingus_log",() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(4f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLINGUS_PLANKS = registerBlock("blingus_wood_planks",() -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(4f).sound(SoundType.WOOD)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
