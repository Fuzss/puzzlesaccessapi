package fuzs.puzzlesaccessapi.api.client.data.v2;

import com.google.gson.JsonElement;
import net.minecraft.core.Direction;
import net.minecraft.core.FrontAndTop;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.*;

import java.util.List;
import java.util.Map;
import java.util.function.*;

public class BlockModelBuilder extends BlockModelGenerators {

    public BlockModelBuilder(Consumer<BlockStateGenerator> blockStateOutput, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput, Consumer<Item> skippedAutoModelsOutput) {
        super(blockStateOutput, modelOutput, skippedAutoModelsOutput);
    }

    public Consumer<BlockStateGenerator> getBlockStateOutput() {
        return this.blockStateOutput;
    }

    public BiConsumer<ResourceLocation, Supplier<JsonElement>> getModelOutput() {
        return this.modelOutput;
    }

    public Consumer<Item> getSkippedAutoModelsOutput() {
        return this.skippedAutoModelsOutput;
    }

    public Map<Block, TexturedModel> getTexturedModels() {
        return this.texturedModels;
    }

    public void setTexturedModels(Map<Block, TexturedModel> texturedModels) {
        this.texturedModels = texturedModels;
    }

    public static BlockStateGenerator createMirroredCubeGenerator(Block cubeBlock, ResourceLocation location, TextureMapping textureMapping, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput) {
        return BlockModelGenerators.createMirroredCubeGenerator(cubeBlock, location, textureMapping, modelOutput);
    }

    public static BlockStateGenerator createNorthWestMirroredCubeGenerator(Block cubeBlock, ResourceLocation location, TextureMapping textureMapping, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput) {
        ResourceLocation resourceLocation = ModelTemplates.CUBE_NORTH_WEST_MIRRORED_ALL.create(cubeBlock, textureMapping, modelOutput);
        return createSimpleBlock(cubeBlock, resourceLocation);
    }

    public static BlockStateGenerator createMirroredColumnGenerator(Block columnBlock, ResourceLocation location, TextureMapping textureMapping, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput) {
        ResourceLocation resourceLocation = ModelTemplates.CUBE_COLUMN_MIRRORED.create(columnBlock, textureMapping, modelOutput);
        return createRotatedVariant(columnBlock, location, resourceLocation).with(createRotatedPillar());
    }

    @Override
    public void skipAutoItemBlock(Block block) {
        super.skipAutoItemBlock(block);
    }

    @Override
    public void delegateItemModel(Block block, ResourceLocation delegateModelLocation) {
        super.delegateItemModel(block, delegateModelLocation);
    }

    @Override
    public void delegateItemModel(Item item, ResourceLocation delegateModelLocation) {
        super.delegateItemModel(item, delegateModelLocation);
    }

    @Override
    public void createSimpleFlatItemModel(Item flatItem) {
        super.createSimpleFlatItemModel(flatItem);
    }

    @Override
    public void createSimpleFlatItemModel(Block flatBlock) {
        super.createSimpleFlatItemModel(flatBlock);
    }

    @Override
    public void createSimpleFlatItemModel(Block flatBlock, String layerZeroTextureSuffix) {
        super.createSimpleFlatItemModel(flatBlock, layerZeroTextureSuffix);
    }

    public static PropertyDispatch createHorizontalFacingDispatch() {
        return BlockModelGenerators.createHorizontalFacingDispatch();
    }

    public static PropertyDispatch createHorizontalFacingDispatchAlt() {
        return BlockModelGenerators.createHorizontalFacingDispatchAlt();
    }

    public static PropertyDispatch createTorchHorizontalDispatch() {
        return BlockModelGenerators.createTorchHorizontalDispatch();
    }

    public static PropertyDispatch createFacingDispatch() {
        return BlockModelGenerators.createFacingDispatch();
    }

    public static MultiVariantGenerator createRotatedVariant(Block block, ResourceLocation modelLocation) {
        return BlockModelGenerators.createRotatedVariant(block, modelLocation);
    }

    public static Variant[] createRotatedVariants(ResourceLocation modelLocation) {
        return BlockModelGenerators.createRotatedVariants(modelLocation);
    }

    public static MultiVariantGenerator createRotatedVariant(Block block, ResourceLocation normalModelLocation, ResourceLocation mirroredModelLocation) {
        return BlockModelGenerators.createRotatedVariant(block, normalModelLocation, mirroredModelLocation);
    }

    public static PropertyDispatch createBooleanModelDispatch(BooleanProperty property, ResourceLocation trueModelLocation, ResourceLocation falseModelLocation) {
        return BlockModelGenerators.createBooleanModelDispatch(property, trueModelLocation, falseModelLocation);
    }

    @Override
    public void createRotatedMirroredVariantBlock(Block block) {
        super.createRotatedMirroredVariantBlock(block);
    }

    @Override
    public void createRotatedVariantBlock(Block block) {
        super.createRotatedVariantBlock(block);
    }

    @Override
    public void createBrushableBlock(Block block) {
        super.createBrushableBlock(block);
    }

    public static BlockStateGenerator createButton(Block buttonBlock, ResourceLocation unpoweredModelLocation, ResourceLocation poweredModelLocation) {
        return BlockModelGenerators.createButton(buttonBlock, unpoweredModelLocation, poweredModelLocation);
    }

    public static PropertyDispatch.C4<Direction, DoubleBlockHalf, DoorHingeSide, Boolean> configureDoorHalf(PropertyDispatch.C4<Direction, DoubleBlockHalf, DoorHingeSide, Boolean> c4, DoubleBlockHalf doubleBlockHalf, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4) {
        return BlockModelGenerators.configureDoorHalf(c4, doubleBlockHalf, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4);
    }

    public static BlockStateGenerator createDoor(Block doorBlock, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4, ResourceLocation resourceLocation5, ResourceLocation resourceLocation6, ResourceLocation resourceLocation7, ResourceLocation resourceLocation8) {
        return BlockModelGenerators.createDoor(doorBlock, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4, resourceLocation5, resourceLocation6, resourceLocation7, resourceLocation8);
    }

    public static BlockStateGenerator createCustomFence(Block block, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4, ResourceLocation resourceLocation5) {
        return BlockModelGenerators.createCustomFence(block, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4, resourceLocation5);
    }

    public static BlockStateGenerator createFence(Block fenceBlock, ResourceLocation fencePostModelLocation, ResourceLocation fenceSideModelLocation) {
        return BlockModelGenerators.createFence(fenceBlock, fencePostModelLocation, fenceSideModelLocation);
    }

    public static BlockStateGenerator createWall(Block wallBlock, ResourceLocation postModelLocation, ResourceLocation lowSideModelLocation, ResourceLocation tallSideModelLocation) {
        return BlockModelGenerators.createWall(wallBlock, postModelLocation, lowSideModelLocation, tallSideModelLocation);
    }

    public static BlockStateGenerator createFenceGate(Block fenceGateBlock, ResourceLocation openModelLocation, ResourceLocation closedModelLocation, ResourceLocation wallOpenModelLocation, ResourceLocation wallClosedModelLocation, boolean uvLock) {
        return BlockModelGenerators.createFenceGate(fenceGateBlock, openModelLocation, closedModelLocation, wallOpenModelLocation, wallClosedModelLocation, uvLock);
    }

    public static BlockStateGenerator createStairs(Block stairsBlock, ResourceLocation innerModelLocation, ResourceLocation straightModelLocation, ResourceLocation outerModelLocation) {
        return BlockModelGenerators.createStairs(stairsBlock, innerModelLocation, straightModelLocation, outerModelLocation);
    }

    public static BlockStateGenerator createOrientableTrapdoor(Block orientableTrapdoorBlock, ResourceLocation topModelLocation, ResourceLocation bottomModelLocation, ResourceLocation openModelLocation) {
        return BlockModelGenerators.createOrientableTrapdoor(orientableTrapdoorBlock, topModelLocation, bottomModelLocation, openModelLocation);
    }

    public static BlockStateGenerator createTrapdoor(Block trapdoorBlock, ResourceLocation topModelLocation, ResourceLocation bottomModelLocation, ResourceLocation openModelLocation) {
        return BlockModelGenerators.createTrapdoor(trapdoorBlock, topModelLocation, bottomModelLocation, openModelLocation);
    }

    public static MultiVariantGenerator createSimpleBlock(Block block, ResourceLocation modelLocation) {
        return BlockModelGenerators.createSimpleBlock(block, modelLocation);
    }

    public static PropertyDispatch createRotatedPillar() {
        return BlockModelGenerators.createRotatedPillar();
    }

    public static BlockStateGenerator createPillarBlockUVLocked(Block block, TextureMapping textureMapping, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput) {
        return BlockModelGenerators.createPillarBlockUVLocked(block, textureMapping, modelOutput);
    }

    public static BlockStateGenerator createAxisAlignedPillarBlock(Block axisAlignedPillarBlock, ResourceLocation modelLocation) {
        return BlockModelGenerators.createAxisAlignedPillarBlock(axisAlignedPillarBlock, modelLocation);
    }

    @Override
    public void createAxisAlignedPillarBlockCustomModel(Block axisAlignedPillarBlock, ResourceLocation modelLocation) {
        super.createAxisAlignedPillarBlockCustomModel(axisAlignedPillarBlock, modelLocation);
    }

    @Override
    public void createHorizontallyRotatedBlock(Block horizontallyRotatedBlock, TexturedModel.Provider provider) {
        super.createHorizontallyRotatedBlock(horizontallyRotatedBlock, provider);
    }

    public static BlockStateGenerator createRotatedPillarWithHorizontalVariant(Block rotatedPillarBlock, ResourceLocation modelLocation, ResourceLocation horizontalModelLocation) {
        return BlockModelGenerators.createRotatedPillarWithHorizontalVariant(rotatedPillarBlock, modelLocation, horizontalModelLocation);
    }

    @Override
    public void createRotatedPillarWithHorizontalVariant(Block rotatedPillarBlock, TexturedModel.Provider modelProvider, TexturedModel.Provider horizontalModelProvider) {
        super.createRotatedPillarWithHorizontalVariant(rotatedPillarBlock, modelProvider, horizontalModelProvider);
    }

    @Override
    public ResourceLocation createSuffixedVariant(Block block, String suffix, ModelTemplate modelTemplate, Function<ResourceLocation, TextureMapping> textureMappingGetter) {
        return super.createSuffixedVariant(block, suffix, modelTemplate, textureMappingGetter);
    }

    public static BlockStateGenerator createPressurePlate(Block pressurePlateBlock, ResourceLocation unpoweredModelLocation, ResourceLocation poweredModelLocation) {
        return BlockModelGenerators.createPressurePlate(pressurePlateBlock, unpoweredModelLocation, poweredModelLocation);
    }

    public static BlockStateGenerator createSlab(Block slabBlock, ResourceLocation bottomHalfModelLocation, ResourceLocation topHalfModelLocation, ResourceLocation doubleModelLocation) {
        return BlockModelGenerators.createSlab(slabBlock, bottomHalfModelLocation, topHalfModelLocation, doubleModelLocation);
    }

    @Override
    public void createTrivialBlock(Block block, TextureMapping textureMapping, ModelTemplate modelTemplate) {
        super.createTrivialBlock(block, textureMapping, modelTemplate);
    }

    @Override
    public BlockFamilyProvider family(Block block) {
        TexturedModel texturedModel = this.texturedModels.getOrDefault(block, TexturedModel.CUBE.get(block));
        return new BlockFamilyProvider(texturedModel.getMapping()).fullBlock(block, texturedModel.getTemplate());
    }

    @Override
    public void createDoor(Block doorBlock) {
        super.createDoor(doorBlock);
    }

    @Override
    public void createOrientableTrapdoor(Block orientableTrapdoorBlock) {
        super.createOrientableTrapdoor(orientableTrapdoorBlock);
    }

    @Override
    public void createTrapdoor(Block trapdoorBlock) {
        super.createTrapdoor(trapdoorBlock);
    }

    @Override
    public WoodProvider woodProvider(Block logBlock) {
        return new WoodProvider(TextureMapping.logColumn(logBlock));
    }

    @Override
    public void createNonTemplateModelBlock(Block block) {
        super.createNonTemplateModelBlock(block);
    }

    @Override
    public void createNonTemplateModelBlock(Block block, Block modelBlock) {
        super.createNonTemplateModelBlock(block, modelBlock);
    }

    public void createCrossBlockWithDefaultItem(Block crossBlock, TintState tintState) {
        super.createCrossBlockWithDefaultItem(crossBlock, tintState.tintState);
    }

    public void createCrossBlockWithDefaultItem(Block crossBlock, TintState tintState, TextureMapping textureMapping) {
        super.createCrossBlockWithDefaultItem(crossBlock, tintState.tintState, textureMapping);
    }

    public void createCrossBlock(Block crossBlock, TintState tintState) {
        super.createCrossBlock(crossBlock, tintState.tintState);
    }

    public void createCrossBlock(Block crossBlock, TintState tintState, TextureMapping textureMapping) {
        super.createCrossBlock(crossBlock, tintState.tintState, textureMapping);
    }

    public void createCrossBlock(Block block, TintState tintState, Property<Integer> property, int... is) {
        super.createCrossBlock(block, tintState.tintState, property, is);
    }

    public void createPlant(Block plantBlock, Block pottedPlantBlock, TintState tintState) {
        super.createPlant(plantBlock, pottedPlantBlock, tintState.tintState);
    }

    @Override
    public void createCoralFans(Block coralFanBlock, Block coralWallFanBlock) {
        super.createCoralFans(coralFanBlock, coralWallFanBlock);
    }

    @Override
    public void createStems(Block unattachedStemBlock, Block attachedStemBlock) {
        super.createStems(unattachedStemBlock, attachedStemBlock);
    }

    @Override
    public void createCoral(Block coralBlock, Block deadCoralBlock, Block coralFullBlock, Block deadCoralFullBlock, Block coralFanBlock, Block deadCoralFanBlock, Block coralWallFanBlock, Block deadCoralWallFanBlock) {
        super.createCoral(coralBlock, deadCoralBlock, coralFullBlock, deadCoralFullBlock, coralFanBlock, deadCoralFanBlock, coralWallFanBlock, deadCoralWallFanBlock);
    }

    public void createDoublePlant(Block doublePlantBlock, TintState tintState) {
        super.createDoublePlant(doublePlantBlock, tintState.tintState);
    }

    @Override
    public void createDoubleBlock(Block doubleBlock, ResourceLocation topHalfModelLocation, ResourceLocation bottomHalfModelLocation) {
        super.createDoubleBlock(doubleBlock, topHalfModelLocation, bottomHalfModelLocation);
    }

    @Override
    public void createPassiveRail(Block railBlock) {
        super.createPassiveRail(railBlock);
    }

    @Override
    public void createActiveRail(Block railBlock) {
        super.createActiveRail(railBlock);
    }

    @Override
    public BlockEntityModelGenerator blockEntityModels(ResourceLocation entityBlockModelLocation, Block particleBlock) {
        return new BlockEntityModelGenerator(entityBlockModelLocation, particleBlock);
    }

    @Override
    public BlockEntityModelGenerator blockEntityModels(Block entityBlockBaseModel, Block particleBlock) {
        return new BlockEntityModelGenerator(ModelLocationUtils.getModelLocation(entityBlockBaseModel), particleBlock);
    }

    @Override
    public void createAirLikeBlock(Block airLikeBlock, Item particleItem) {
        super.createAirLikeBlock(airLikeBlock, particleItem);
    }

    @Override
    public void createAirLikeBlock(Block airLikeBlock, ResourceLocation particleTexture) {
        super.createAirLikeBlock(airLikeBlock, particleTexture);
    }

    @Override
    public void createFullAndCarpetBlocks(Block fullBlock, Block carpetBlock) {
        super.createFullAndCarpetBlocks(fullBlock, carpetBlock);
    }

    @Override
    public void createFlowerBed(Block block) {
        super.createFlowerBed(block);
    }

    @Override
    public void createColoredBlockWithRandomRotations(TexturedModel.Provider modelProvider, Block... coloredBlocks) {
        super.createColoredBlockWithRandomRotations(modelProvider, coloredBlocks);
    }

    @Override
    public void createColoredBlockWithStateRotations(TexturedModel.Provider modelProvider, Block... coloredBlocks) {
        super.createColoredBlockWithStateRotations(modelProvider, coloredBlocks);
    }

    @Override
    public void createGlassBlocks(Block glassBlock, Block paneBlock) {
        super.createGlassBlocks(glassBlock, paneBlock);
    }

    @Override
    public void createCommandBlock(Block commandBlock) {
        super.createCommandBlock(commandBlock);
    }

    @Override
    public void createAnvil(Block anvilBlock) {
        super.createAnvil(anvilBlock);
    }

    @Override
    public List<Variant> createBambooModels(int age) {
        return super.createBambooModels(age);
    }

    @Override
    public PropertyDispatch createColumnWithFacing() {
        return super.createColumnWithFacing();
    }

    public static <T extends Comparable<T>> PropertyDispatch createEmptyOrFullDispatch(Property<T> property, T minimumValueForFullVariant, ResourceLocation fullVariantModelLocation, ResourceLocation emptyVariantModelLocation) {
        return BlockModelGenerators.createEmptyOrFullDispatch(property, minimumValueForFullVariant, fullVariantModelLocation, emptyVariantModelLocation);
    }

    @Override
    public void createBeeNest(Block beeNestBlock, Function<Block, TextureMapping> textureMappingGetter) {
        super.createBeeNest(beeNestBlock, textureMappingGetter);
    }

    @Override
    public void createCropBlock(Block cropBlock, Property<Integer> ageProperty, int... ageToVisualStageMapping) {
        super.createCropBlock(cropBlock, ageProperty, ageToVisualStageMapping);
    }

    @Override
    public void createFurnace(Block furnaceBlock, TexturedModel.Provider modelProvider) {
        super.createFurnace(furnaceBlock, modelProvider);
    }

    @Override
    public void createCampfires(Block... campfireBlocks) {
        super.createCampfires(campfireBlocks);
    }

    @Override
    public void createAzalea(Block azaleaBlock) {
        super.createAzalea(azaleaBlock);
    }

    @Override
    public void createPottedAzalea(Block pottedAzaleaBlock) {
        super.createPottedAzalea(pottedAzaleaBlock);
    }

    @Override
    public void createMushroomBlock(Block mushroomBlock) {
        super.createMushroomBlock(mushroomBlock);
    }

    @Override
    public void createCraftingTableLike(Block craftingTableBlock, Block craftingTableMaterialBlock, BiFunction<Block, Block, TextureMapping> textureMappingGetter) {
        super.createCraftingTableLike(craftingTableBlock, craftingTableMaterialBlock, textureMappingGetter);
    }

    @Override
    public void createPumpkinVariant(Block pumpkinBlock, TextureMapping columnTextureMapping) {
        super.createPumpkinVariant(pumpkinBlock, columnTextureMapping);
    }

    @Override
    public void createDispenserBlock(Block dispenserBlock) {
        super.createDispenserBlock(dispenserBlock);
    }

    @Override
    public void createAmethystCluster(Block amethystBlock) {
        super.createAmethystCluster(amethystBlock);
    }

    @Override
    public Variant createPointedDripstoneVariant(Direction direction, DripstoneThickness dripstoneThickness) {
        return super.createPointedDripstoneVariant(direction, dripstoneThickness);
    }

    @Override
    public void createNyliumBlock(Block nyliumBlock) {
        super.createNyliumBlock(nyliumBlock);
    }

    @Override
    public void createRotatableColumn(Block rotatableColumnBlock) {
        super.createRotatableColumn(rotatableColumnBlock);
    }

    @Override
    public List<ResourceLocation> createFloorFireModels(Block fireBlock) {
        return super.createFloorFireModels(fireBlock);
    }

    @Override
    public List<ResourceLocation> createSideFireModels(Block fireBlock) {
        return super.createSideFireModels(fireBlock);
    }

    @Override
    public List<ResourceLocation> createTopFireModels(Block fireBlock) {
        return super.createTopFireModels(fireBlock);
    }

    public static List<Variant> wrapModels(List<ResourceLocation> modelLocations, UnaryOperator<Variant> variantMapper) {
        return BlockModelGenerators.wrapModels(modelLocations, variantMapper);
    }

    @Override
    public void createLantern(Block lanternBlock) {
        super.createLantern(lanternBlock);
    }

    @Override
    public void createGrassLikeBlock(Block grassLikeBlock, ResourceLocation modelLocation, Variant variant) {
        super.createGrassLikeBlock(grassLikeBlock, modelLocation, variant);
    }

    @Override
    public void createWeightedPressurePlate(Block pressurePlateBlock, Block plateMaterialBlock) {
        super.createWeightedPressurePlate(pressurePlateBlock, plateMaterialBlock);
    }

    @Override
    public void copyModel(Block sourceBlock, Block targetBlock) {
        super.copyModel(sourceBlock, targetBlock);
    }

    @Override
    public void createNonTemplateHorizontalBlock(Block horizontalBlock) {
        super.createNonTemplateHorizontalBlock(horizontalBlock);
    }

    @Override
    public void createPistonVariant(Block pistonBlock, ResourceLocation baseModelLocation, TextureMapping topTextureMapping) {
        super.createPistonVariant(pistonBlock, baseModelLocation, topTextureMapping);
    }

    @Override
    public void createNormalTorch(Block torchBlock, Block wallTorchBlock) {
        super.createNormalTorch(torchBlock, wallTorchBlock);
    }

    @Override
    public ResourceLocation createTurtleEggModel(int hatchAmount, String variantName, TextureMapping textureMapping) {
        return super.createTurtleEggModel(hatchAmount, variantName, textureMapping);
    }

    @Override
    public ResourceLocation createTurtleEggModel(Integer eggAmount, Integer variantId) {
        return super.createTurtleEggModel(eggAmount, variantId);
    }

    @Override
    public void createMultiface(Block multifaceBlock) {
        super.createMultiface(multifaceBlock);
    }

    @Override
    public void addSlotStateAndRotationVariants(MultiPartGenerator multiPartGenerator, Condition.TerminalCondition terminalCondition, VariantProperties.Rotation rotation) {
        super.addSlotStateAndRotationVariants(multiPartGenerator, terminalCondition, rotation);
    }

    @Override
    public void addBookSlotModel(MultiPartGenerator multiPartGenerator, Condition.TerminalCondition terminalCondition, VariantProperties.Rotation rotation, BooleanProperty booleanProperty, ModelTemplate modelTemplate, boolean bl) {
        super.addBookSlotModel(multiPartGenerator, terminalCondition, rotation, booleanProperty, modelTemplate, bl);
    }

    @Override
    public void createShulkerBox(Block shulkerBoxBlock) {
        super.createShulkerBox(shulkerBoxBlock);
    }

    public void createGrowingPlant(Block growingPlantBlock, Block plantBlock, TintState tintState) {
        super.createGrowingPlant(growingPlantBlock, plantBlock, tintState.tintState);
    }

    @Override
    public void createBedItem(Block bedBlock, Block woolBlock) {
        super.createBedItem(bedBlock, woolBlock);
    }

    @Override
    public void createNetherRoots(Block plantBlock, Block pottedPlantBlock) {
        super.createNetherRoots(plantBlock, pottedPlantBlock);
    }

    @Override
    public Variant applyRotation(FrontAndTop frontAndTop, Variant variant) {
        return super.applyRotation(frontAndTop, variant);
    }

    @Override
    public void createCandleAndCandleCake(Block candleBlock, Block candleCakeBlock) {
        super.createCandleAndCandleCake(candleBlock, candleCakeBlock);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException();
    }

    public final class BlockEntityModelGenerator extends BlockModelGenerators.BlockEntityModelGenerator {

        public BlockEntityModelGenerator(ResourceLocation baseModel, Block particleBlock) {
            super(baseModel, particleBlock);
        }

        @Override
        public BlockEntityModelGenerator create(Block... blocks) {
            super.create(blocks);
            return this;
        }

        @Override
        public BlockEntityModelGenerator createWithoutBlockItem(Block... blocks) {
            super.createWithoutBlockItem(blocks);
            return this;
        }

        @Override
        public BlockEntityModelGenerator createWithCustomBlockItemModel(ModelTemplate modelTemplate, Block... blocks) {
            super.createWithCustomBlockItemModel(modelTemplate, blocks);
            return this;
        }
    }

    public final class BlockFamilyProvider extends BlockModelGenerators.BlockFamilyProvider {

        public BlockFamilyProvider(TextureMapping mapping) {
            super(mapping);
        }

        @Override
        public BlockFamilyProvider fullBlock(Block block, ModelTemplate modelTemplate) {
            super.fullBlock(block, modelTemplate);
            return this;
        }

        @Override
        public BlockFamilyProvider fullBlockCopies(Block... blocks) {
            super.fullBlockCopies(blocks);
            return this;
        }

        @Override
        public BlockFamilyProvider button(Block buttonBlock) {
            super.button(buttonBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider wall(Block wallBlock) {
            super.wall(wallBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider customFence(Block block) {
            super.customFence(block);
            return this;
        }

        @Override
        public BlockFamilyProvider fence(Block fenceBlock) {
            super.fence(fenceBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider customFenceGate(Block customFenceGateBlock) {
            super.customFenceGate(customFenceGateBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider fenceGate(Block fenceGateBlock) {
            super.fenceGate(fenceGateBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider pressurePlate(Block pressurePlateBlock) {
            super.pressurePlate(pressurePlateBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider sign(Block signBlock) {
            super.sign(signBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider slab(Block slabBlock) {
            super.slab(slabBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider stairs(Block stairsBlock) {
            super.stairs(stairsBlock);
            return this;
        }

        @Override
        public BlockFamilyProvider generateFor(BlockFamily family) {
            super.generateFor(family);
            return this;
        }
    }

    public enum TintState {
        TINTED(BlockModelGenerators.TintState.TINTED), NOT_TINTED(BlockModelGenerators.TintState.NOT_TINTED);

        private final BlockModelGenerators.TintState tintState;

        TintState(BlockModelGenerators.TintState tintState) {
            this.tintState = tintState;
        }
    }

    public final class WoodProvider extends BlockModelGenerators.WoodProvider {

        public WoodProvider(TextureMapping logMapping) {
            super(logMapping);
        }

        @Override
        public WoodProvider wood(Block woodBlock) {
            super.wood(woodBlock);
            return this;
        }

        @Override
        public WoodProvider log(Block logBlock) {
            super.log(logBlock);
            return this;
        }

        @Override
        public WoodProvider logWithHorizontal(Block logBlock) {
            super.logWithHorizontal(logBlock);
            return this;
        }

        @Override
        public WoodProvider logUVLocked(Block block) {
            super.logUVLocked(block);
            return this;
        }
    }
}
