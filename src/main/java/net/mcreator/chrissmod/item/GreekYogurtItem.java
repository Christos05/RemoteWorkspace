
package net.mcreator.chrissmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class GreekYogurtItem extends Item {
	public GreekYogurtItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f).alwaysEat().build()));
	}
}