package uk.co.wehavecookies56.kk.common.world.dimension;

import javax.annotation.Nullable;

import net.minecraft.init.Biomes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.chunk.IChunkGenerator;

/**
 * Created by Toby on 01/08/2016.
 */
public class WorldProviderDiveToTheHeart extends WorldProvider {

    @Override
    protected void createBiomeProvider() {
        this.biomeProvider = new BiomeProviderSingle(Biomes.SKY);
        this.hasNoSky = true;
        NBTTagCompound nbttagcompound = this.worldObj.getWorldInfo().getDimensionData(ModDimensions.diveToTheHeart);
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkProviderDiveToTheHeart(this.worldObj, this.worldObj.getWorldInfo().isMapFeaturesEnabled(), this.worldObj.getSeed());
    }

    @Override
    public float calculateCelestialAngle(long worldTime, float partialTicks) {
        return 0.0F;
    }

    @Nullable
    @Override
    public float[] calcSunriseSunsetColors(float celestialAngle, float partialTicks) {
        return null;
    }

    @Override
    public Vec3d getFogColor(float p_76562_1_, float p_76562_2_) {
        float f = MathHelper.cos(p_76562_1_ * ((float)Math.PI * 2F)) * 2.0F + 0.5F;
        f = MathHelper.clamp_float(f, 0.0F, 1.0F);
        float f1 = 0.627451F;
        float f2 = 0.5019608F;
        float f3 = 0.627451F;
        f1 = f1 * (f * 0.0F + 0.15F);
        f2 = f2 * (f * 0.0F + 0.15F);
        f3 = f3 * (f * 0.0F + 0.15F);
        return new Vec3d((double)f1, (double)f2, (double)f3);
    }

    @Override
    public boolean isSkyColored() {
        return false;
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }

    @Override
    public float getCloudHeight() {
        return 8.0F;
    }

    @Override
    public boolean canCoordinateBeSpawn(int x, int z) {
        return this.worldObj.getGroundAboveSeaLevel(new BlockPos(x, 0, z)).getMaterial().blocksMovement();
    }

    @Override
    public BlockPos getSpawnCoordinate() {
        return new BlockPos(0, 64, 0);
    }

    @Override
    public int getAverageGroundLevel() {
        return 64;
    }

    @Override
    public boolean doesXZShowFog(int x, int z) {
        return false;
    }

    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.diveToTheHeart;
    }

    @Override
    public void onWorldSave() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        this.worldObj.getWorldInfo().setDimensionData(getDimensionType(), nbtTagCompound);
    }

    @Override
    public void onWorldUpdateEntities() {

    }
}
