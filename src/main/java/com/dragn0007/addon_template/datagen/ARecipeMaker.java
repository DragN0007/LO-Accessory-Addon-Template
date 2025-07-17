package com.dragn0007.addon_template.datagen;

import com.dragn0007.addon_template.AddonTemplateMain;
import com.dragn0007.addon_template.items.AItems;
import com.dragn0007.dragnlivestock.LivestockOverhaul;
import com.dragn0007.dragnlivestock.compat.medievalembroidery.MECompatItems;
import com.dragn0007.dragnlivestock.datagen.conditions.BlanketConfigCondition;
import com.dragn0007.dragnlivestock.items.LOItems;
import com.dragn0007.dragnlivestock.util.LOTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;

import java.util.function.Consumer;

public class ARecipeMaker extends RecipeProvider implements IConditionBuilder {
    public ARecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        //Armor
        //Looking for the minimal variant? Check data/addon_template/recipes/minimal_coal_horse_armor_smithing.json
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AItems.COAL_HORSE_ARMOR.get())
                .define('A', Items.LEATHER)
                .define('B', ItemTags.WOOL_CARPETS)
                .define('C', Items.COAL)
                .pattern("  C")
                .pattern("CCC")
                .pattern("ABA")
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LEATHER).build()))
                .save(pFinishedRecipeConsumer);


        //Saddles
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AItems.COAL_SADDLE.get())
                .requires(Items.SADDLE)
                .requires(Items.COAL)
                .unlockedBy("has_saddle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SADDLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AItems.COAL_LIGHT_SADDLE.get())
                .requires(LOItems.LIGHT_SADDLE.get())
                .requires(Items.COAL)
                .unlockedBy("has_saddle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SADDLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AItems.COAL_HEAVY_SADDLE.get())
                .requires(LOItems.HEAVY_SADDLE.get())
                .requires(Items.COAL)
                .unlockedBy("has_saddle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SADDLE)
                        .build()))
                .save(pFinishedRecipeConsumer);


        //Blankets
        ConditionalRecipe.builder()
                .addCondition(new BlanketConfigCondition(new ResourceLocation(LivestockOverhaul.MODID, "blanket_config_condition")))
                .addRecipe(
                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AItems.COAL_MEDIEVAL_BLANKET.get())
                                .define('A', Items.COAL)
                                .define('D', Items.GOLD_NUGGET)
                                .pattern("AAA")
                                .pattern("ADA")
                                .unlockedBy("has_carpet", has(ItemTags.WOOL_CARPETS))
                                ::save).build
                        (pFinishedRecipeConsumer, new ResourceLocation(AddonTemplateMain.MODID, AItems.COAL_MEDIEVAL_BLANKET.get().toString()));

        ConditionalRecipe.builder()
                .addCondition(new BlanketConfigCondition(new ResourceLocation(LivestockOverhaul.MODID, "blanket_config_condition")))
                .addRecipe(
                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AItems.COAL_MODERN_BLANKET.get())
                                .define('A', Items.COAL)
                                .pattern("AAA")
                                .pattern("AA ")
                                .unlockedBy("has_carpet", has(ItemTags.WOOL_CARPETS))
                                ::save).build
                        (pFinishedRecipeConsumer, new ResourceLocation(AddonTemplateMain.MODID, AItems.COAL_MODERN_BLANKET.get().toString()));

        ConditionalRecipe.builder()
                .addCondition(new BlanketConfigCondition(new ResourceLocation(LivestockOverhaul.MODID, "blanket_config_condition")))
                .addRecipe(
                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AItems.COAL_RACING_BLANKET.get())
                                .define('A', Items.COAL)
                                .pattern("AAA")
                                .pattern("A  ")
                                .unlockedBy("has_carpet", has(ItemTags.WOOL_CARPETS))
                                ::save).build
                        (pFinishedRecipeConsumer, new ResourceLocation(AddonTemplateMain.MODID, AItems.COAL_RACING_BLANKET.get().toString()));


        ConditionalRecipe.builder()
                .addCondition(new BlanketConfigCondition(new ResourceLocation(LivestockOverhaul.MODID, "blanket_config_condition")))
                .addRecipe(
                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AItems.COAL_WESTERN_BLANKET.get())
                                .define('A', Items.COAL)
                                .pattern("AAA")
                                .pattern("AAA")
                                .unlockedBy("has_carpet", has(ItemTags.WOOL_CARPETS))
                                ::save).build
                        (pFinishedRecipeConsumer, new ResourceLocation(AddonTemplateMain.MODID, AItems.COAL_WESTERN_BLANKET.get().toString()));

    }
}