package com.dragn0007.addon_template.datagen;

import com.dragn0007.addon_template.AddonTemplateMain;
import com.dragn0007.addon_template.items.AItems;
import com.dragn0007.dragnlivestock.LivestockOverhaul;
import com.dragn0007.dragnlivestock.items.LOItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class AItemModelProvider extends ItemModelProvider {
    public AItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AddonTemplateMain.MODID, existingFileHelper);
    }

    // To generate these, use the runData option in forgegradle runs. Make sure to check gradle.properties and make sure
    // your modid is correct in there, else this won't do anything.
    // Also make sure your item textures are the same exact name as the item's registry name and are in the right folder.

    @Override
    public void registerModels() {
        simpleItem(AItems.COAL_HORSE_ARMOR);
        simpleItem(AItems.MINIMAL_COAL_HORSE_ARMOR);

        simpleItem(AItems.COAL_SADDLE);
        simpleItem(AItems.COAL_LIGHT_SADDLE);
        simpleItem(AItems.COAL_HEAVY_SADDLE);

        simpleItem(AItems.COAL_MEDIEVAL_BLANKET);
        simpleItem(AItems.COAL_MODERN_BLANKET);
        simpleItem(AItems.COAL_RACING_BLANKET);
        simpleItem(AItems.COAL_WESTERN_BLANKET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AddonTemplateMain.MODID,"item/" + item.getId().getPath()));
    }
}