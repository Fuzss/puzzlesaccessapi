package fuzs.puzzlesaccessapi.api.client.data.v2;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ExtendableItemModelGenerators extends ItemModelGenerators {

    public ExtendableItemModelGenerators(BiConsumer<ResourceLocation, Supplier<JsonElement>> output) {
        super(output);
    }

    public BiConsumer<ResourceLocation, Supplier<JsonElement>> getOutput() {
        return this.output;
    }

    @Override
    public void generateFlatItem(Item item, ModelTemplate modelTemplate) {
        super.generateFlatItem(item, modelTemplate);
    }

    @Override
    public void generateFlatItem(Item item, String modelLocationSuffix, ModelTemplate modelTemplate) {
        super.generateFlatItem(item, modelLocationSuffix, modelTemplate);
    }

    @Override
    public void generateFlatItem(Item item, Item layerZeroItem, ModelTemplate modelTemplate) {
        super.generateFlatItem(item, layerZeroItem, modelTemplate);
    }

    @Override
    public void generateCompassItem(Item item) {
        super.generateCompassItem(item);
    }

    @Override
    public void generateClockItem(Item item) {
        super.generateClockItem(item);
    }

    @Override
    public void generateLayeredItem(ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3) {
        super.generateLayeredItem(resourceLocation, resourceLocation2, resourceLocation3);
    }

    @Override
    public void generateLayeredItem(ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4) {
        super.generateLayeredItem(resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4);
    }

    @Override
    public ResourceLocation getItemModelForTrimMaterial(ResourceLocation resourceLocation, String string) {
        return super.getItemModelForTrimMaterial(resourceLocation, string);
    }

    @Override
    public JsonObject generateBaseArmorTrimTemplate(ResourceLocation resourceLocation, Map<TextureSlot, ResourceLocation> map, ArmorMaterial armorMaterial) {
        return super.generateBaseArmorTrimTemplate(resourceLocation, map, armorMaterial);
    }

    @Override
    public void generateArmorTrims(ArmorItem armorItem) {
        super.generateArmorTrims(armorItem);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException();
    }
}
