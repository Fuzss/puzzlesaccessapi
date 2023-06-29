package fuzs.puzzlesaccessapi.api.client.container.v1;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public abstract class ExtendableContainerScreen<T extends AbstractContainerMenu> extends AbstractContainerScreen<T> {

    public ExtendableContainerScreen(T menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    protected final void renderFloatingItem(GuiGraphics guiGraphics, ItemStack itemStack, int i, int j, String string) {
        this._renderFloatingItem(guiGraphics, itemStack, i, j, string);
    }

    protected void _renderFloatingItem(GuiGraphics guiGraphics, ItemStack itemStack, int i, int j, String string) {
        super.renderFloatingItem(guiGraphics, itemStack, i, j, string);
    }

    @Override
    protected final void renderSlot(GuiGraphics guiGraphics, Slot slot) {
        this._renderSlot(guiGraphics, slot);
    }

    protected void _renderSlot(GuiGraphics guiGraphics, Slot slot) {
        super.renderSlot(guiGraphics, slot);
    }

    @Override
    protected final void recalculateQuickCraftRemaining() {
        this._recalculateQuickCraftRemaining();
    }

    protected void _recalculateQuickCraftRemaining() {
        super.recalculateQuickCraftRemaining();
    }

    @Nullable
    @Override
    protected final Slot findSlot(double mouseX, double mouseY) {
        return this._findSlot(mouseX, mouseY);
    }

    @Nullable
    protected Slot _findSlot(double mouseX, double mouseY) {
        return super.findSlot(mouseX, mouseY);
    }

    @Nullable
    protected Slot getClickedSlot() {
        return this.clickedSlot;
    }

    @Nullable
    protected Slot getSnapbackEnd() {
        return this.snapbackEnd;
    }

    @Nullable
    protected Slot getQuickdropSlot() {
        return this.quickdropSlot;
    }

    @Nullable
    protected Slot getLastClickSlot() {
        return this.lastClickSlot;
    }

    protected boolean isSplittingStack() {
        return this.isSplittingStack;
    }

    protected ItemStack getDraggingItem() {
        return this.draggingItem;
    }

    protected int getSnapbackStartX() {
        return this.snapbackStartX;
    }

    protected int getSnapbackStartY() {
        return this.snapbackStartY;
    }

    protected long getSnapbackTime() {
        return this.snapbackTime;
    }

    protected ItemStack getSnapbackItem() {
        return this.snapbackItem;
    }

    protected long getQuickdropTime() {
        return this.quickdropTime;
    }

    protected int getQuickCraftingType() {
        return this.quickCraftingType;
    }

    protected int getQuickCraftingButton() {
        return this.quickCraftingButton;
    }

    protected boolean isSkipNextRelease() {
        return this.skipNextRelease;
    }

    protected int getQuickCraftingRemainder() {
        return this.quickCraftingRemainder;
    }

    protected long getLastClickTime() {
        return this.lastClickTime;
    }

    protected int getLastClickButton() {
        return this.lastClickButton;
    }

    protected boolean isDoubleclick() {
        return this.doubleclick;
    }

    protected ItemStack getLastQuickMoved() {
        return this.lastQuickMoved;
    }

    protected void setClickedSlot(@Nullable Slot clickedSlot) {
        this.clickedSlot = clickedSlot;
    }

    protected void setSnapbackEnd(@Nullable Slot snapbackEnd) {
        this.snapbackEnd = snapbackEnd;
    }

    protected void setQuickdropSlot(@Nullable Slot quickdropSlot) {
        this.quickdropSlot = quickdropSlot;
    }

    protected void setLastClickSlot(@Nullable Slot lastClickSlot) {
        this.lastClickSlot = lastClickSlot;
    }

    protected void setSplittingStack(boolean splittingStack) {
        this.isSplittingStack = splittingStack;
    }

    protected void setDraggingItem(ItemStack draggingItem) {
        this.draggingItem = draggingItem;
    }

    protected void setSnapbackStartX(int snapbackStartX) {
        this.snapbackStartX = snapbackStartX;
    }

    protected void setSnapbackStartY(int snapbackStartY) {
        this.snapbackStartY = snapbackStartY;
    }

    protected void setSnapbackTime(long snapbackTime) {
        this.snapbackTime = snapbackTime;
    }

    protected void setSnapbackItem(ItemStack snapbackItem) {
        this.snapbackItem = snapbackItem;
    }

    protected void setQuickdropTime(long quickdropTime) {
        this.quickdropTime = quickdropTime;
    }

    protected void setQuickCraftingType(int quickCraftingType) {
        this.quickCraftingType = quickCraftingType;
    }

    protected void setQuickCraftingButton(int quickCraftingButton) {
        this.quickCraftingButton = quickCraftingButton;
    }

    protected void setSkipNextRelease(boolean skipNextRelease) {
        this.skipNextRelease = skipNextRelease;
    }

    protected void setQuickCraftingRemainder(int quickCraftingRemainder) {
        this.quickCraftingRemainder = quickCraftingRemainder;
    }

    protected void setLastClickTime(long lastClickTime) {
        this.lastClickTime = lastClickTime;
    }

    protected void setLastClickButton(int lastClickButton) {
        this.lastClickButton = lastClickButton;
    }

    protected void setDoubleclick(boolean doubleclick) {
        this.doubleclick = doubleclick;
    }

    protected void setLastQuickMoved(ItemStack lastQuickMoved) {
        this.lastQuickMoved = lastQuickMoved;
    }
}
