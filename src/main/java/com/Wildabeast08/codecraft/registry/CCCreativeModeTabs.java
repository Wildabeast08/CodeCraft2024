package com.Wildabeast08.codecraft.registry;

import com.Wildabeast08.codecraft.CodeCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CCCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CodeCraft.MOD_ID);

    //Creative Mode Tabs go here
public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
        "example_tab",
        () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.creative_tab"))
                .withTabsBefore(CreativeModeTabs.FOOD_AND_DRINKS)
                .icon(() -> CCItems.EXAMPLE_ITEM.get().getDefaultInstance())
                .displayItems(((pParameters, pOutput) -> {
                    pOutput.accept(CCItems.SECOND_ITEM);
                    pOutput.accept(CCItems.EXAMPLE_ITEM);
                    pOutput.accept(CCItems.THIRD_ITEM);
                    pOutput.accept(CCItems.FOURTH_ITEM);
    }))
                .build());


    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

}
