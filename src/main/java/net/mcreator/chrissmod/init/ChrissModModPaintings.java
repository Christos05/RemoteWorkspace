
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chrissmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.chrissmod.ChrissModMod;

public class ChrissModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ChrissModMod.MODID);
	public static final RegistryObject<PaintingVariant> CHESSYSTUDIOSLOGO = REGISTRY.register("chessystudioslogo", () -> new PaintingVariant(64, 32));
}
