package net.mcreator.chrissmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CanPlaceOnionBlockProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 0.5, z)) >= 8 && (world.getBlockState(BlockPos.containing(x, y - (-1), z))).is(BlockTags.create(new ResourceLocation("crops:farmland")))) {
			return true;
		}
		return false;
	}
}
