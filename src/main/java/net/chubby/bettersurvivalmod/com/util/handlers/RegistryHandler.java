package net.chubby.bettersurvivalmod.com.util.handlers;

import net.chubby.bettersurvivalmod.com.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        ModItems.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
        ModItems.registerModels();
    }
}
