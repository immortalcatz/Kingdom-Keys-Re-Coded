package uk.co.wehavecookies56.kk.common.network.packet.server;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import uk.co.wehavecookies56.kk.client.sound.ModSounds;
import uk.co.wehavecookies56.kk.common.capability.ModCapabilities;
import uk.co.wehavecookies56.kk.common.container.inventory.InventoryKeychain;
import uk.co.wehavecookies56.kk.common.container.inventory.InventoryPotionsMenu;
import uk.co.wehavecookies56.kk.common.lib.Strings;
import uk.co.wehavecookies56.kk.common.network.packet.AbstractMessage;
import uk.co.wehavecookies56.kk.common.network.packet.PacketDispatcher;
import uk.co.wehavecookies56.kk.common.network.packet.client.SyncLevelData;

public class RemoveItemInSlot extends AbstractMessage.AbstractServerMessage<RemoveItemInSlot> {
	String inv;
	int slot;
	InventoryPotionsMenu potions;
	InventoryKeychain keychain;
	boolean sound;

	public RemoveItemInSlot () {}

	public RemoveItemInSlot (String inventory, int slot) {
		this.inv = inventory;
		this.slot = slot;
		this.sound = false;
	}

	public RemoveItemInSlot (String inventory, int slot, boolean sound) {
		this.inv = inventory;
		this.slot = slot;
		this.sound = sound;
	}

	@Override
	protected void read (PacketBuffer buffer) throws IOException {
		inv = buffer.readStringFromBuffer(100);
		slot = buffer.readInt();
		sound = buffer.readBoolean();
	}

	@Override
	protected void write (PacketBuffer buffer) throws IOException {
		buffer.writeString(inv);
		buffer.writeInt(slot);
		buffer.writeBoolean(sound);
	}

	@Override
	public void process (EntityPlayer player, Side side) {
		switch (inv) {
			case "keychain":
				keychain = player.getCapability(ModCapabilities.SUMMON_KEYBLADE, null).getInventoryKeychain();
				keychain.setInventorySlotContents(slot, null);
				break;
			case Strings.DefenseBoost:
				if(!player.capabilities.isCreativeMode)
					player.inventory.removeStackFromSlot(player.inventory.currentItem);
				player.getCapability(ModCapabilities.PLAYER_STATS, null).addDefense(1);
				TextComponentTranslation strMessage = new TextComponentTranslation(Strings.Chat_DefenseBoost, new TextComponentTranslation(""+player.getCapability(ModCapabilities.PLAYER_STATS, null).getDefense()));
				strMessage.getStyle().setColor(TextFormatting.GREEN);
				player.addChatMessage(strMessage);	
				break;
			case Strings.MagicBoost:
				if(!player.capabilities.isCreativeMode)
					player.inventory.removeStackFromSlot(player.inventory.currentItem);
				player.getCapability(ModCapabilities.PLAYER_STATS, null).addMagic(1);
				TextComponentTranslation magMessage = new TextComponentTranslation(Strings.Chat_MagicBoost, new TextComponentTranslation(""+player.getCapability(ModCapabilities.PLAYER_STATS, null).getMagic()));
				magMessage.getStyle().setColor(TextFormatting.GREEN);
				player.addChatMessage(magMessage);	

				break;
			case Strings.PowerBoost:
				if(!player.capabilities.isCreativeMode)
					player.inventory.removeStackFromSlot(player.inventory.currentItem);
				player.getCapability(ModCapabilities.PLAYER_STATS, null).addStrength(1);
				TextComponentTranslation powMessage = new TextComponentTranslation(Strings.Chat_PowerBoost, new TextComponentTranslation(""+player.getCapability(ModCapabilities.PLAYER_STATS, null).getStrength()));
				powMessage.getStyle().setColor(TextFormatting.GREEN);
				player.addChatMessage(powMessage);	

				break;
			case Strings.Potion:
				potions = player.getCapability(ModCapabilities.PLAYER_STATS, null).getInventoryPotionsMenu();
				potions.setInventorySlotContents(slot, null);
				if (sound) player.worldObj.playSound(null, player.getPosition(), ModSounds.potion, SoundCategory.MASTER, 0.5f, 1);
				break;
		}
		PacketDispatcher.sendTo(new SyncLevelData(player.getCapability(ModCapabilities.PLAYER_STATS, null)), (EntityPlayerMP)player);
	}
}
