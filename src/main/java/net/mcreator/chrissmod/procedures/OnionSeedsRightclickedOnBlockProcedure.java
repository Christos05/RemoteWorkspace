package net.mcreator.chrissmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

import net.mcreator.chrissmod.init.ChrissModModItems;

public class OnionSeedsRightclickedOnBlockProcedure {
	public static void execute() {
		ItemStack Seeds = ItemStack.EMPTY;
		BlockState OnionPlantStage0 = Blocks.AIR.defaultBlockState();
		Seeds = new ItemStack(ChrissModModItems.ONION_SEEDS.get());
	}
}
