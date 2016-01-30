package wehavecookies56.kk.entities.magic;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import wehavecookies56.kk.network.packet.PacketDispatcher;
import wehavecookies56.kk.network.packet.client.SpawnCureParticles;

public class EntityCura extends Entity {

	EntityPlayer player;

	public EntityCura(World world) {
		super(world);
	}

	public EntityCura(World world, EntityPlayer sender, double x, double y, double z) {
		super(world);
		this.posX = x;
		this.posY = y;
		this.posZ = z;
		this.player = sender;
	}

	@Override
	public void onUpdate() {
		if (player == null)
			return;
		if (!worldObj.isRemote)
			PacketDispatcher.sendToAllAround(new SpawnCureParticles(this, 2), player, 64.0D);
		this.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX, this.posY + 2.5, this.posZ, 0.0D, 1.0D,
				0.0D);
		this.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX, this.posY + 2.8, this.posZ, 0.0D, 1.0D,
				0.0D);
		this.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX, this.posY + 2.2, this.posZ, 0.0D, 1.0D,
				0.0D);
		this.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX + 0.3, this.posY + 2.5, this.posZ, 0.0D,
				1.0D, 0.0D);
		this.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX - 0.3, this.posY + 2.5, this.posZ, 0.0D,
				1.0D, 0.0D);

		if (ticksExisted > 10)
			setDead();

		if (ticksExisted < 10)
			player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
		else
			player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612D);
		super.onUpdate();
	}

	@Override
	protected void entityInit() {

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tagCompund) {

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tagCompound) {

	}
}
