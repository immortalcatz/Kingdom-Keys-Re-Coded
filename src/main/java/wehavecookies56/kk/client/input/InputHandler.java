package wehavecookies56.kk.client.input;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import wehavecookies56.kk.client.gui.GuiCommandMenu;
import wehavecookies56.kk.entities.ExtendedPlayer;
import wehavecookies56.kk.item.ItemKeyblade;
import wehavecookies56.kk.item.ItemKeychain;
import wehavecookies56.kk.lib.Constants;
import wehavecookies56.kk.magic.Magic;
import wehavecookies56.kk.network.packet.PacketDispatcher;
import wehavecookies56.kk.network.packet.client.SyncExtendedPlayer;
import wehavecookies56.kk.network.packet.server.DeSummonKeyblade;
import wehavecookies56.kk.network.packet.server.DriveFormPacket;
import wehavecookies56.kk.network.packet.server.GiveAchievementOpenMenu;
import wehavecookies56.kk.network.packet.server.PlaySoundAtPlayer;
import wehavecookies56.kk.network.packet.server.SummonKeyblade;
import wehavecookies56.kk.util.GuiHelper;
import wehavecookies56.kk.util.KeyboardHelper;
import wehavecookies56.kk.util.SoundHelper;

public class InputHandler {

	private Keybinds getPressedKey(){
		for(Keybinds key : Keybinds.values()){
			if(key.isPressed()) return key;
		}
		return null;
	}

	public void commandUp()
	{
		if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAIN) //Mainmenu
		{
			if(GuiCommandMenu.selected == GuiCommandMenu.ATTACK){
				GuiCommandMenu.selected = GuiCommandMenu.DRIVE;
			}else{
				GuiCommandMenu.selected++;
			}
		}

		else if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAGIC)//InsideMagic
		{
			if (GuiCommandMenu.magicselected >= 0 && GuiCommandMenu.magicselected <= GuiCommandMenu.FIRE)
			{
				GuiCommandMenu.magicselected++;
				GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAGIC;

			}
			else if (GuiCommandMenu.magicselected == GuiCommandMenu.MAGIC_TOP)
			{
				GuiCommandMenu.magicselected = GuiCommandMenu.STOP;
			}
		}

		else if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_ITEMS)//InsideItems
		{}

		else if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_DRIVE)//InsideDrive
		{
			if (GuiCommandMenu.driveselected >= 0 && GuiCommandMenu.driveselected <= GuiCommandMenu.VALOR)
			{
				GuiCommandMenu.driveselected++;
				GuiCommandMenu.submenu = GuiCommandMenu.SUB_DRIVE;
			}
			else if (GuiCommandMenu.driveselected == GuiCommandMenu.DRIVE_TOP)
			{
				GuiCommandMenu.driveselected = GuiCommandMenu.FINAL;
			}
		}
	}

	public void commandDown()
	{
		if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAIN) //Mainmenu
		{
			if(GuiCommandMenu.selected == GuiCommandMenu.DRIVE){
				GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
			}else{
				GuiCommandMenu.selected--;
			}
		}

		else if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAGIC)//InsideMagic
		{
			if (GuiCommandMenu.magicselected > 0 && GuiCommandMenu.magicselected <= GuiCommandMenu.FIRE)
			{
				GuiCommandMenu.magicselected--;
				GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAGIC;

			}
			else if (GuiCommandMenu.magicselected == 0 || GuiCommandMenu.magicselected == GuiCommandMenu.MAGIC_TOP)
			{
				GuiCommandMenu.magicselected = GuiCommandMenu.FIRE;
			}
		}

		else if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_ITEMS)//InsideItems
		{}

		else if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_DRIVE)//InsideDrive
		{
			if (GuiCommandMenu.driveselected > 0 && GuiCommandMenu.driveselected <= GuiCommandMenu.VALOR)
			{
				GuiCommandMenu.driveselected--;
				GuiCommandMenu.submenu = GuiCommandMenu.SUB_DRIVE;

			}
			else if (GuiCommandMenu.driveselected == 0 || GuiCommandMenu.driveselected == GuiCommandMenu.DRIVE_TOP)
			{
				GuiCommandMenu.driveselected = GuiCommandMenu.VALOR;
			}
		}
	}

	public void commandEnter()
	{
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		World world = mc.theWorld;

		switch(GuiCommandMenu.selected)
		{
		case GuiCommandMenu.MAGIC:
			if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAIN)
			GuiCommandMenu.magicselected = GuiCommandMenu.NONE;
			GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAGIC;
			break;

		case GuiCommandMenu.ITEMS:
			//GuiCommandMenu.submenu = GuiCommandMenu.SUB_ITEMS;
			break;

		case GuiCommandMenu.DRIVE:
			if(GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAIN)
			{
				if(ExtendedPlayer.get(player).getInDrive())
				{
					PacketDispatcher.sendToServer(new DriveFormPacket(true));
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
				}
				else
				{
					GuiCommandMenu.driveselected = GuiCommandMenu.NONE;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_DRIVE;
				}
			}
			break;
		}
		if(GuiCommandMenu.selected == GuiCommandMenu.MAGIC && GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAGIC)
		{
			switch(GuiCommandMenu.magicselected)
			{
				case GuiCommandMenu.FIRE:
					Magic.Fire(player, world);
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;

				case GuiCommandMenu.BLIZZARD:
					Magic.Blizzard(player, world);
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.THUNDER:
					Magic.Thunder(player, world);
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.CURE:
					Magic.Cure(player, world);
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.AERO:
					Magic.Aero(player, world);
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.STOP:
					Magic.Stop(player, world);
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
			}
		}

		if(GuiCommandMenu.selected == GuiCommandMenu.DRIVE && GuiCommandMenu.submenu == GuiCommandMenu.SUB_DRIVE)
		{
			switch(GuiCommandMenu.driveselected)
			{
				case GuiCommandMenu.VALOR:
					PacketDispatcher.sendToServer(new DriveFormPacket("valor"));
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;

				case GuiCommandMenu.WISDOM:
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.LIMIT:
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.MASTER:
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
				case GuiCommandMenu.FINAL:
					GuiCommandMenu.selected = GuiCommandMenu.ATTACK;
					GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
					break;
			}
		}
	}

	public void commandBack()
	{
		if (GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAIN)
		{
			GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
		}
		else if (GuiCommandMenu.submenu == GuiCommandMenu.SUB_MAGIC)
		{
			GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
		}
		else if (GuiCommandMenu.submenu == GuiCommandMenu.SUB_ITEMS)
		{
			GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
		}
		else if (GuiCommandMenu.submenu == GuiCommandMenu.SUB_DRIVE)
		{
			GuiCommandMenu.submenu = GuiCommandMenu.SUB_MAIN;
		}
		GuiCommandMenu.magicselected = GuiCommandMenu.MAGIC;
		GuiCommandMenu.driveselected = GuiCommandMenu.DRIVE;
	}

	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		World world = mc.theWorld;

		Keybinds key = getPressedKey();
		if(key != null){
			switch(key){
			case OPENMENU:
				GuiHelper.openMenu();
				PacketDispatcher.sendToServer(new GiveAchievementOpenMenu());
				break;
			case SCROLL_UP:
				commandUp();
				PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Move, 1f, 1f));
				break;

			case SCROLL_DOWN:
				commandDown();
				PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Move, 1f, 1f));
				break;

			case ENTER:
				commandEnter();
				PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Select, 1f, 1f));
				break;

			case BACK:
				commandBack();
				PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Cancel, 1f, 1f));
				break;
			case SUMMON_KEYBLADE:
				ExtendedPlayer props = ExtendedPlayer.get(mc.thePlayer);
				if(props.inventory.getStackInSlot(0) == null){
					PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Error, 0.5f, 1f));
					break;
				}
				if(props.isKeybladeSummoned() == false && player.inventory.getCurrentItem() == null && props.inventory.getStackInSlot(0).getItem() instanceof ItemKeychain){
					PacketDispatcher.sendToServer(new SummonKeyblade(((ItemKeychain) props.inventory.getStackInSlot(0).getItem()).getKeyblade()));
					PacketDispatcher.sendToServer(new SyncExtendedPlayer(player));
				} else if(player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof ItemKeyblade && props.isKeybladeSummoned() == true){
					PacketDispatcher.sendToServer(new DeSummonKeyblade(player.inventory.getCurrentItem()));
					PacketDispatcher.sendToServer(new SyncExtendedPlayer(player));
				} else {
					break;
				}
				break;
			case SCROLL_ACTIVATOR:
				break;
			default:
				break;
			}
		}
	}

	@SubscribeEvent
	public void OnMouseWheelScroll(MouseEvent event){
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		World world = mc.theWorld;
		if(!mc.inGameHasFocus && !KeyboardHelper.isScrollActivatorDown()){
			event.setCanceled(false);
			return;
		}

		if(event.button == Constants.LEFT_MOUSE && KeyboardHelper.isScrollActivatorDown() && event.buttonstate){
			commandEnter();
			event.setCanceled(true);
			PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Select, 1f, 1f));
		}

		if(event.button == Constants.RIGHT_MOUSE && KeyboardHelper.isScrollActivatorDown() && event.buttonstate){
			commandBack();
			event.setCanceled(true);
			PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Cancel, 1f, 1f));
		}

		if(event.dwheel <= Constants.WHEEL_DOWN && KeyboardHelper.isScrollActivatorDown() && event.dwheel != 0){
			commandDown();
			event.setCanceled(true);
			PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Move, 1f, 1f));
		}
		if(event.dwheel >= Constants.WHEEL_UP && KeyboardHelper.isScrollActivatorDown() && event.dwheel != 0){
			commandUp();
			event.setCanceled(true);
			PacketDispatcher.sendToServer(new PlaySoundAtPlayer(SoundHelper.Move, 1f, 1f));
		}

	}
}