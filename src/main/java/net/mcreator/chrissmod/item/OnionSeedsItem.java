
package net.mcreator.chrissmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.chrissmod.procedures.OnionSeedsRightclickedOnBlockProcedure;

public class OnionSeedsItem extends Item {
	public OnionSeedsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		OnionSeedsRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}
