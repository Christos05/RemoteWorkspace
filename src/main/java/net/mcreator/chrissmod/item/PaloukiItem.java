
package net.mcreator.chrissmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PaloukiItem extends Item {
	public PaloukiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
