
package net.mcreator.chrissmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Block2Item extends Item {
	public Block2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
