
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chrissmod.block.TomatoBlock;
import net.mcreator.chrissmod.block.TestBlock;
import net.mcreator.chrissmod.block.OnionPlantBlock;
import net.mcreator.chrissmod.block.LunaBlock;
import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChrissModMod.MODID);
	public static final RegistryObject<Block> ONION_PLANT = REGISTRY.register("onion_plant", () -> new OnionPlantBlock());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> TOMATO = REGISTRY.register("tomato", () -> new TomatoBlock());
	public static final RegistryObject<Block> LUNA = REGISTRY.register("luna", () -> new LunaBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
