
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chrissmod.block.OnionPlantStage2Block;
import net.mcreator.chrissmod.block.OnionPlantStage1Block;
import net.mcreator.chrissmod.block.OnionPlantStage0Block;
import net.mcreator.chrissmod.block.OnionPlantBlock;
import net.mcreator.chrissmod.block.OnionPlant0Block;
import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChrissModMod.MODID);
	public static final RegistryObject<Block> ONION_PLANT = REGISTRY.register("onion_plant", () -> new OnionPlantBlock());
	public static final RegistryObject<Block> ONION_PLANT_STAGE_0A = REGISTRY.register("onion_plant_stage_0a", () -> new OnionPlantStage0Block());
	public static final RegistryObject<Block> ONION_PLANT_STAGE_1A = REGISTRY.register("onion_plant_stage_1a", () -> new OnionPlantStage1Block());
	public static final RegistryObject<Block> ONION_PLANT_STAGE_2A = REGISTRY.register("onion_plant_stage_2a", () -> new OnionPlantStage2Block());
	public static final RegistryObject<Block> ONION_PLANT_0 = REGISTRY.register("onion_plant_0", () -> new OnionPlant0Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
