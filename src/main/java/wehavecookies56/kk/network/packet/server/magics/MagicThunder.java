package wehavecookies56.kk.network.packet.server.magics;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import wehavecookies56.kk.entities.ExtendedPlayer;
import wehavecookies56.kk.entities.magic.EntityThundaga;
import wehavecookies56.kk.entities.magic.EntityThundara;
import wehavecookies56.kk.entities.magic.EntityThunder;
import wehavecookies56.kk.lib.Constants;
import wehavecookies56.kk.lib.Strings;
import wehavecookies56.kk.network.packet.AbstractMessage.AbstractServerMessage;

public class MagicThunder extends AbstractServerMessage<MagicThunder> {

	public MagicThunder() {
	}

	@Override
	protected void read(PacketBuffer buffer) throws IOException {
	}

	@Override
	protected void write(PacketBuffer buffer) throws IOException {
	}

	@Override
	public void process(EntityPlayer player, Side side) {
		if (!ExtendedPlayer.get(player).cheatMode)
			ExtendedPlayer.get(player).removeMp(Constants.getCost(Strings.Gui_CommandMenu_Magic_Thunder));
		World world = player.worldObj;
		if (!world.isRemote)
			switch (ExtendedPlayer.get(player).getMagicLevel("Thunder")) {
			case 1:
				world.spawnEntityInWorld(new EntityThunder(world, player, player.posX, player.posY, player.posZ));
				break;
			case 2:
				world.spawnEntityInWorld(new EntityThundara(world, player, player.posX, player.posY, player.posZ));
				break;
			case 3:
				world.spawnEntityInWorld(new EntityThundaga(world, player, player.posX, player.posY, player.posZ));
				break;
			}
	}
}