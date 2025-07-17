package com.dragn0007.addon_template.items;

import com.dragn0007.dragnlivestock.LivestockOverhaul;
import com.dragn0007.dragnlivestock.items.LOItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AItemGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LivestockOverhaul.MODID);

    public static final RegistryObject<CreativeModeTab> ADDON_GROUND = CREATIVE_MODE_TABS.register("addon_template", // Change me to your MODID
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AItems.COAL_HORSE_ARMOR.get())).title(Component.translatable("itemGroup.addon_template")) // Change me to your MODID
                    //                                               ^ Change this if you want
                    .displayItems((displayParameters, output) -> {

                        output.accept(AItems.COAL_HORSE_ARMOR.get());
                        output.accept(AItems.MINIMAL_COAL_HORSE_ARMOR.get());

                        output.accept(AItems.COAL_SADDLE.get());
                        output.accept(AItems.COAL_LIGHT_SADDLE.get());
                        output.accept(AItems.COAL_HEAVY_SADDLE.get());

                        output.accept(AItems.COAL_MEDIEVAL_BLANKET.get());
                        output.accept(AItems.COAL_MODERN_BLANKET.get());
                        output.accept(AItems.COAL_RACING_BLANKET.get());
                        output.accept(AItems.COAL_WESTERN_BLANKET.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


