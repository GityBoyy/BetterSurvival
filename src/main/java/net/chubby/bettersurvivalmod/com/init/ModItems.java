package net.chubby.bettersurvivalmod.com.init;

import net.chubby.bettersurvivalmod.com.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static final ItemBase SAPPHIRE = new ItemBase("sapphire").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                SAPPHIRE
        );
    }

    public static void registerModels() {
        SAPPHIRE.registerItemModel();
    }
}
