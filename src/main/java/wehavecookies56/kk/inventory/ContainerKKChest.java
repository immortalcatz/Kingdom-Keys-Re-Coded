package wehavecookies56.kk.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import wehavecookies56.kk.entities.TileEntityKKChest;

public class ContainerKKChest extends Container {

	// Stores a reference to the tile entity instance for later use
	private TileEntityKKChest tileEntityKKChest;

	// must assign a slot number to each of the slots used by the GUI.
	// For this container, we can see both the tile inventory's slots as well as
	// the player inventory slots and the hotbar.
	// Each time we add a Slot to the container, it automatically increases the
	// slotIndex, which means
	// 0 - 8 = hotbar slots (which will map to the InventoryPlayer slot numbers
	// 0 - 8)
	// 9 - 35 = player inventory slots (which map to the InventoryPlayer slot
	// numbers 9 - 35)
	// 36 - 44 = TileInventory slots, which map to our TileEntity slot numbers 0
	// - 8)

	private final int HOTBAR_SLOT_COUNT = 9;
	private final int PLAYER_INVENTORY_ROW_COUNT = 3;
	private final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
	private final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
	private final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;

	private final int VANILLA_FIRST_SLOT_INDEX = 0;
	private final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
	private final int TE_INVENTORY_SLOT_COUNT = 9;

	public ContainerKKChest(InventoryPlayer invPlayer, TileEntityKKChest tileEntityKKChest) {
		this.tileEntityKKChest = tileEntityKKChest;

		final int SLOT_X_SPACING = 18;
		final int SLOT_Y_SPACING = 18;
		final int HOTBAR_XPOS = 8;
		final int HOTBAR_YPOS = 109;
		// Add the players hotbar to the gui - the [xpos, ypos] location of each
		// item
		for (int x = 0; x < HOTBAR_SLOT_COUNT; x++) {
			int slotNumber = x;
			addSlotToContainer(new Slot(invPlayer, slotNumber, HOTBAR_XPOS + SLOT_X_SPACING * x, HOTBAR_YPOS));
		}

		final int PLAYER_INVENTORY_XPOS = 8;
		final int PLAYER_INVENTORY_YPOS = 51;
		// Add the rest of the players inventory to the gui
		for (int y = 0; y < PLAYER_INVENTORY_ROW_COUNT; y++)
			for (int x = 0; x < PLAYER_INVENTORY_COLUMN_COUNT; x++) {
				int slotNumber = HOTBAR_SLOT_COUNT + y * PLAYER_INVENTORY_COLUMN_COUNT + x;
				int xpos = PLAYER_INVENTORY_XPOS + x * SLOT_X_SPACING;
				int ypos = PLAYER_INVENTORY_YPOS + y * SLOT_Y_SPACING;
				addSlotToContainer(new Slot(invPlayer, slotNumber, xpos, ypos));
			}

		if (TE_INVENTORY_SLOT_COUNT != tileEntityKKChest.getSizeInventory())
			System.err.println("Mismatched slot count in ContainerBasic(" + TE_INVENTORY_SLOT_COUNT
					+ ") and TileInventory (" + tileEntityKKChest.getSizeInventory() + ")");
		final int TILE_INVENTORY_XPOS = 8;
		final int TILE_INVENTORY_YPOS = 20;
		// Add the tile inventory container to the gui
		for (int x = 0; x < TE_INVENTORY_SLOT_COUNT; x++) {
			int slotNumber = x;
			addSlotToContainer(new Slot(tileEntityKKChest, slotNumber, TILE_INVENTORY_XPOS + SLOT_X_SPACING * x,
					TILE_INVENTORY_YPOS));
		}
	}

	// Vanilla calls this method every tick to make sure the player is still
	// able to access the inventory, and if not closes the gui
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntityKKChest.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex) {
		Slot sourceSlot = inventorySlots.get(sourceSlotIndex);
		if (sourceSlot == null || !sourceSlot.getHasStack())
			return null;
		ItemStack sourceStack = sourceSlot.getStack();
		ItemStack copyOfSourceStack = sourceStack.copy();

		// Check if the slot clicked is one of the vanilla container slots
		if (sourceSlotIndex >= VANILLA_FIRST_SLOT_INDEX
				&& sourceSlotIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
			// This is a vanilla container slot so merge the stack into the tile
			// inventory
			if (!mergeItemStack(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX,
					TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false))
				return null;
		} else if (sourceSlotIndex >= TE_INVENTORY_FIRST_SLOT_INDEX
				&& sourceSlotIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
			// This is a TE slot so merge the stack into the players inventory
			if (!mergeItemStack(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT,
					false))
				return null;
		} else {
			System.err.print("Invalid slotIndex:" + sourceSlotIndex);
			return null;
		}

		// If stack size == 0 (the entire stack was moved) set slot contents to
		// null
		if (sourceStack.stackSize == 0)
			sourceSlot.putStack(null);
		else
			sourceSlot.onSlotChanged();

		sourceSlot.onPickupFromSlot(player, sourceStack);
		return copyOfSourceStack;
	}

	// pass the close container message to the tileEntityInventory (not strictly
	// needed for this example)
	// see ContainerChest and TileEntityChest
	@Override
	public void onContainerClosed(EntityPlayer playerIn) {
		super.onContainerClosed(playerIn);
		this.tileEntityKKChest.closeInventory(playerIn);
	}
}