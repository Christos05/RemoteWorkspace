
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.chrissmod.block.entity.OnionPlant3BlockEntity;
import net.mcreator.chrissmod.block.entity.OnionPlant2BlockEntity;
import net.mcreator.chrissmod.block.entity.OnionPlant1BlockEntity;
import net.mcreator.chrissmod.block.entity.OnionPlant0BlockEntity;
import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChrissModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ONION_PLANT_0 = register("onion_plant_0", ChrissModModBlocks.ONION_PLANT_0, OnionPlant0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ONION_PLANT_1 = register("onion_plant_1", ChrissModModBlocks.ONION_PLANT_1, OnionPlant1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ONION_PLANT_2 = register("onion_plant_2", ChrissModModBlocks.ONION_PLANT_2, OnionPlant2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ONION_PLANT_3 = register("onion_plant_3", ChrissModModBlocks.ONION_PLANT_3, OnionPlant3BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
