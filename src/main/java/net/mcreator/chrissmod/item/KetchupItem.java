
package net.mcreator.chrissmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KetchupItem extends Item {
	public KetchupItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
