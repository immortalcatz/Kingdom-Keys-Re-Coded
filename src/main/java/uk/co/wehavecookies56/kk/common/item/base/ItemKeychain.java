package uk.co.wehavecookies56.kk.common.item.base;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemKeychain extends ItemSword {

	public ItemKeychain(ItemKeyblade blade, ToolMaterial material) {
		super(material);
		this.blade = blade;
		setMaxStackSize(1);	
	}
	ItemKeyblade blade;
	
	public void setKeyblade (ItemKeyblade blade) {
		this.blade = blade;
	}

	public ItemKeyblade getKeyblade () {
		return this.blade;
	}
	@Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book){
		return true;
	}

	@Override
	public int getItemEnchantability() {
		return 30;
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(0, target);
		return true;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
		stack.damageItem(0, entityLiving);
		return true;
	}
}
