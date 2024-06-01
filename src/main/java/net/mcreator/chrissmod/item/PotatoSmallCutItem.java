
package net.mcreator.chrissmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PotatoSmallCutItem extends Item {
	public PotatoSmallCutItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).build()));
	}
}