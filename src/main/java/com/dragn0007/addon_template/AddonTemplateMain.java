package com.dragn0007.addon_template;

import com.dragn0007.addon_template.items.AItemGroup;
import com.dragn0007.addon_template.items.AItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;


@Mod(AddonTemplateMain.MODID) // You'll reference MODID a lot from this class.
public class AddonTemplateMain
{
    // You can rename this class to whatever. To rename it and all instances of it, right-click the class and go to
    // "Refactor > Rename" and rename it to whatever you want. Make sure it's something easy to remember in case you
    // need to reference it in another class.

    public static final String MODID = "addon_template";
    // Change this to whatever you want your modid to be. ^
    // Make sure you also change all other instances to the same thing, including any "addon_template" folders and in the en_us.json.
    // Do not use any capitals, punctuations, or spaces in your modid.

    // Good MODID Example: dragnlivestock
    // Bad MODID Example: DragN's Livestock

    public AddonTemplateMain()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AItems.register(eventBus);
        AItemGroup.register(eventBus);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
    }

}