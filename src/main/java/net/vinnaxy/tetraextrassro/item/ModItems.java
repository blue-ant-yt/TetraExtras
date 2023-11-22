package net.vinnaxy.tetraextrassro.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vinnaxy.tetraextrassro.TetraExtrasSro;

public class ModItems {
   public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, TetraExtrasSro.MOD_ID);


   public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
   }
}
