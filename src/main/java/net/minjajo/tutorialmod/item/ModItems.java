package net.minjajo.tutorialmod.item;

import net.minecraftforge.registries.RegistryObject;
import net.minjajo.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minjajo.tutorialmod.item.custom.ChiselItem;
import net.minjajo.tutorialmod.item.custom.FuelItem;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem((new Item.Properties().durability(16))));

    public static final RegistryObject<Item> MANGO = ITEMS.register("mango", () -> new Item(new Item.Properties().food(ModFoodProperties.MANGO)));

    public static final RegistryObject<Item>  NUCLEAR_WASTE = ITEMS.register("nuclear_waste", () -> new FuelItem(new Item.Properties(), 500));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
