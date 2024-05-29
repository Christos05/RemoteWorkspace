
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.chrissmod.ChrissModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChrissModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChrissModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(ChrissModModItems.TOMATO.get());
			tabData.accept(ChrissModModItems.ONION.get());
			tabData.accept(ChrissModModItems.ONION_SEEDS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ChrissModModBlocks.ONION_PLANT.get().asItem());
			tabData.accept(ChrissModModBlocks.ONION_PLANT_STAGE_0A.get().asItem());
			tabData.accept(ChrissModModBlocks.ONION_PLANT_STAGE_1A.get().asItem());
			tabData.accept(ChrissModModBlocks.ONION_PLANT_STAGE_2A.get().asItem());
		}
	}
}
