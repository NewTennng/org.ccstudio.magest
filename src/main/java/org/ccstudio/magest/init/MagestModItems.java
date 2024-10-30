
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.ccstudio.magest.init;

import org.ccstudio.magest.item.TestItem;
import org.ccstudio.magest.MagestMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class MagestModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MagestMod.MODID);
	public static final DeferredItem<Item> TEST = REGISTRY.register("test", TestItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
