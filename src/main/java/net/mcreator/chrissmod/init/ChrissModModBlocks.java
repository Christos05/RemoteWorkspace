
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chrissmod.block.OnionPlant3Block;
import net.mcreator.chrissmod.block.OnionPlant2Block;
import net.mcreator.chrissmod.block.OnionPlant1Block;
import net.mcreator.chrissmod.block.OnionPlant0Block;
import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChrissModMod.MODID);
	public static final RegistryObject<Block> ONION_PLANT_0 = REGISTRY.register("onion_plant_0", () -> new OnionPlant0Block());
	public static final RegistryObject<Block> ONION_PLANT_1 = REGISTRY.register("onion_plant_1", () -> new OnionPlant1Block());
	public static final RegistryObject<Block> ONION_PLANT_2 = REGISTRY.register("onion_plant_2", () -> new OnionPlant2Block());
	public static final RegistryObject<Block> ONION_PLANT_3 = REGISTRY.register("onion_plant_3", () -> new OnionPlant3Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
