
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chrissmod.item.TomatoItem;
import net.mcreator.chrissmod.item.OnionSeedsItem;
import net.mcreator.chrissmod.item.OnionItem;
import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChrissModMod.MODID);
	public static final RegistryObject<Item> TEST = block(ChrissModModBlocks.TEST);
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> ONION = REGISTRY.register("onion", () -> new OnionItem());
	public static final RegistryObject<Item> ONION_PLANT = block(ChrissModModBlocks.ONION_PLANT);
	public static final RegistryObject<Item> ONION_SEEDS = REGISTRY.register("onion_seeds", () -> new OnionSeedsItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
