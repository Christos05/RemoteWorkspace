
package net.mcreator.chrissmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OnionItem extends Item {
	public OnionItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build()));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 50;
	}
}