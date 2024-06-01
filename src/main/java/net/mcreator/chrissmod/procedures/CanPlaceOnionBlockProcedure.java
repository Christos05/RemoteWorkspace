package net.mcreator.chrissmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CanPlaceOnionBlockProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 0.5, z)) >= 8 && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			return true;
		}
		return false;
	}
}
