package fuzs.puzzlesaccessapi.api.container.v1;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public abstract class ExtendableContainerMenu extends AbstractContainerMenu {
    
    public ExtendableContainerMenu(@Nullable MenuType<?> menuType, int containerId) {
        super(menuType, containerId);
    }

    @Override
    protected void doClick(int slotId, int button, ClickType clickType, Player player) {
        super.doClick(slotId, button, clickType, player);
    }

    @Override
    protected boolean tryItemClickBehaviourOverride(Player player, ClickAction action, Slot slot, ItemStack clickedItem, ItemStack carriedItem) {
        return super.tryItemClickBehaviourOverride(player, action, slot, clickedItem, carriedItem);
    }

    protected int getQuickcraftType() {
        return this.quickcraftType;
    }

    protected int getQuickcraftStatus() {
        return this.quickcraftStatus;
    }

    protected Set<Slot> getQuickcraftSlots() {
        return this.quickcraftSlots;
    }

    protected void setQuickcraftType(int quickcraftType) {
        this.quickcraftType = quickcraftType;
    }

    protected void setQuickcraftStatus(int quickcraftStatus) {
        this.quickcraftStatus = quickcraftStatus;
    }
}
