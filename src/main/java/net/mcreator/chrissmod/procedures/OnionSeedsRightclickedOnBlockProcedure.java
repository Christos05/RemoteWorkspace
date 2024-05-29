package net.mcreator.chrissmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class OnionSeedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack Seeds = ItemStack.EMPTY;
		BlockState OnionPlantStage0 = Blocks.AIR.defaultBlockState();
		Seeds = new ItemStack(ChrissModModItems.ONION_SEEDS.get());
		OnionPlantStage0 = ChrissModModBlocks.ONION_PLANT_STAGE_0.get().defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Seeds.getItem() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && OnionPlantStage0.canSurvive(world, BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), OnionPlantStage0, 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
					_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
