package com.dragn0007.addon_template.items;

import com.dragn0007.addon_template.AddonTemplateMain;
import com.dragn0007.dragnlivestock.items.custom.BlanketItem;
import com.dragn0007.dragnlivestock.items.custom.LightHorseArmorItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SaddleItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AddonTemplateMain.MODID);

    // Make sure to extend your item types accordingly, else you may not be able to put them in the right slots.
    // Check out the en_us.json to rename your items when you're done so they show up correctly ingame.



    //Armor does not have to be registered in a tag
    //                                       v This should always be UPPERCASE       v This should always be lowercase
    public static final RegistryObject<Item> COAL_HORSE_ARMOR = ITEMS.register("coal_horse_armor", // < Registry names
            () -> new HorseArmorItem(2, "coal", (new Item.Properties()).stacksTo(1)));
    //                ^ Item type extension  ^ Protection amount                                         ^ How many of this item can fit in a stack
    public static final RegistryObject<Item> MINIMAL_COAL_HORSE_ARMOR = ITEMS.register("minimal_coal_horse_armor",
            () -> new LightHorseArmorItem(1, "light_coal", (new Item.Properties()).stacksTo(1)));

    //Saddles should be registered in the data/dragnlivestock/tags/items/saddles.json tag
    public static final RegistryObject<Item> COAL_SADDLE = ITEMS.register("coal_saddle",
            () -> new SaddleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> COAL_LIGHT_SADDLE = ITEMS.register("coal_light_saddle",
            () -> new SaddleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> COAL_HEAVY_SADDLE = ITEMS.register("coal_heavy_saddle",
            () -> new SaddleItem(new Item.Properties().stacksTo(1)));

    //Carpets should be registered in the data/dragnlivestock/tags/items/special_blankets.json tag
    public static final RegistryObject<Item> COAL_MEDIEVAL_BLANKET = ITEMS.register("coal_medieval_blanket",
            () -> new BlanketItem(DyeColor.WHITE, new Item.Properties()));
    public static final RegistryObject<Item> COAL_MODERN_BLANKET = ITEMS.register("coal_modern_blanket",
            () -> new BlanketItem(DyeColor.WHITE, new Item.Properties()));
    public static final RegistryObject<Item> COAL_RACING_BLANKET = ITEMS.register("coal_racing_blanket",
            () -> new BlanketItem(DyeColor.WHITE, new Item.Properties()));
    public static final RegistryObject<Item> COAL_WESTERN_BLANKET = ITEMS.register("coal_western_blanket",
            () -> new BlanketItem(DyeColor.WHITE, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}