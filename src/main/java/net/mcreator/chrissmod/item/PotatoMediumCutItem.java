
package net.mcreator.chrissmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PotatoMediumCutItem extends Item {
	public PotatoMediumCutItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).build()));
	}
}