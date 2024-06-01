
package net.mcreator.chrissmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class FetaCheeseItem extends Item {
	public FetaCheeseItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.5f).alwaysEat().build()));
	}
}