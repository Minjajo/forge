package net.minjajo.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minjajo.tutorialmod.TutorialMod;
import net.minjajo.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> RUBY_ITEMS_TAB = CREATIVE_MODE_TABS.register("ruby_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.tutorialmod.ruby_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RAW_RUBY.get());

                        output.accept(ModItems.CHISEL.get());



                    }).build());

    public static final RegistryObject<CreativeModeTab> RUBY_BLOCKS_TAB = CREATIVE_MODE_TABS.register("ruby_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK.get()))
                    .withTabsBefore(RUBY_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.ruby_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> FRUITS_TAB = CREATIVE_MODE_TABS.register("fruits_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANGO.get()))
                    .withTabsBefore(RUBY_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.ruby_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.MANGO.get());
                        output.accept(ModItems.NUCLEAR_WASTE.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
