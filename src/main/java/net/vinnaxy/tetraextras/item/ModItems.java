package net.vinnaxy.tetraextras.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vinnaxy.tetraextras.TetraExtras;

public class ModItems {
   public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, TetraExtras.MOD_ID);


   public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
   }
}
