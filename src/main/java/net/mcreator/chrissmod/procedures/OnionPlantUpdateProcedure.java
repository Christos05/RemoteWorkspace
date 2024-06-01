package net.mcreator.chrissmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.chrissmod.init.ChrissModModBlocks;

public class OnionPlantUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		stage0 = ChrissModModBlocks.ONION_PLANT_0.get().defaultBlockState();
		stage1 = ChrissModModBlocks.ONION_PLANT_1.get().defaultBlockState();
		stage2 = ChrissModModBlocks.ONION_PLANT_2.get().defaultBlockState();
		stage3 = ChrissModModBlocks.ONION_PLANT_3.get().defaultBlockState();
		if (Math.random() <= 0.2) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))) == stage0) {
				world.setBlock(BlockPos.containing(x, y, z), stage1, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == stage1) {
				world.setBlock(BlockPos.containing(x, y, z), stage2, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == stage2) {
				world.setBlock(BlockPos.containing(x, y, z), stage3, 3);
			}
		}
	}
}
