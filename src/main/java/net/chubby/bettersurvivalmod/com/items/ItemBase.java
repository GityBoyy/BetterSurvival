package net.chubby.bettersurvivalmod.com.items;

import net.chubby.bettersurvivalmod.BetterSurvivalMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    protected String name;
    public ItemBase(String name){
        this.name = name;
        setRegistryName(name);

    }
    public void registerItemModel() {
        BetterSurvivalMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
