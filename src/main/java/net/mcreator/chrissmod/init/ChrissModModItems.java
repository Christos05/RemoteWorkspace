
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

import net.mcreator.chrissmod.item.TsapaItem;
import net.mcreator.chrissmod.item.TomatoItem;
import net.mcreator.chrissmod.item.PotatoSmallCutItem;
import net.mcreator.chrissmod.item.PotatoMediumCutItem;
import net.mcreator.chrissmod.item.PitaItem;
import net.mcreator.chrissmod.item.PaloukiItem;
import net.mcreator.chrissmod.item.OnionSeedsItem;
import net.mcreator.chrissmod.item.OnionItem;
import net.mcreator.chrissmod.item.KnifeItem;
import net.mcreator.chrissmod.item.GreekYogurtItem;
import net.mcreator.chrissmod.item.FetaCheeseItem;
import net.mcreator.chrissmod.item.CucamberItem;
import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChrissModMod.MODID);
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> ONION = REGISTRY.register("onion", () -> new OnionItem());
	public static final RegistryObject<Item> ONION_SEEDS = REGISTRY.register("onion_seeds", () -> new OnionSeedsItem());
	public static final RegistryObject<Item> PITA = REGISTRY.register("pita", () -> new PitaItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> ONION_PLANT_0 = block(ChrissModModBlocks.ONION_PLANT_0);
	public static final RegistryObject<Item> ONION_PLANT_1 = block(ChrissModModBlocks.ONION_PLANT_1);
	public static final RegistryObject<Item> ONION_PLANT_2 = block(ChrissModModBlocks.ONION_PLANT_2);
	public static final RegistryObject<Item> ONION_PLANT_3 = block(ChrissModModBlocks.ONION_PLANT_3);
	public static final RegistryObject<Item> TSAPA = REGISTRY.register("tsapa", () -> new TsapaItem());
	public static final RegistryObject<Item> PALOUKI = REGISTRY.register("palouki", () -> new PaloukiItem());
	public static final RegistryObject<Item> CUCAMBER = REGISTRY.register("cucamber", () -> new CucamberItem());
	public static final RegistryObject<Item> FETA_CHEESE = REGISTRY.register("feta_cheese", () -> new FetaCheeseItem());
	public static final RegistryObject<Item> POTATO_MEDIUM_CUT = REGISTRY.register("potato_medium_cut", () -> new PotatoMediumCutItem());
	public static final RegistryObject<Item> POTATO_SMALL_CUT = REGISTRY.register("potato_small_cut", () -> new PotatoSmallCutItem());
	public static final RegistryObject<Item> GREEK_YOGURT = REGISTRY.register("greek_yogurt", () -> new GreekYogurtItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
