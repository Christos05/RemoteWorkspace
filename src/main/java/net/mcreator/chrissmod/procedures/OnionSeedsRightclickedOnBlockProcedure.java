package net.mcreator.chrissmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.chrissmod.init.ChrissModModItems;
import net.mcreator.chrissmod.init.ChrissModModBlocks;

public class OnionSeedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack Seeds = ItemStack.EMPTY;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ChrissModModItems.ONION_SEEDS.get())) : false) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CAVE_AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z), ChrissModModBlocks.ONION_PLANT.get().defaultBlockState(), 3);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ChrissModModItems.ONION_SEEDS.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ChrissModModBlocks.ONION_PLANT.get().defaultBlockState()));
				}
			}
		}
	}
}
