package uk.co.wehavecookies56.kk.common.synthesis.recipe;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;
import uk.co.wehavecookies56.kk.api.materials.Material;
import uk.co.wehavecookies56.kk.api.materials.MaterialRegistry;
import uk.co.wehavecookies56.kk.api.recipes.Recipe;
import uk.co.wehavecookies56.kk.common.item.ModItems;
import uk.co.wehavecookies56.kk.common.lib.Strings;

public class RecipeOblivion extends Recipe {

	public String name;

	public RecipeOblivion (String name) {
		this.name = name;
	}

	@Override
	public String getName () {
		return name;
	}

	@Override
	public ItemStack getResult () {
		return new ItemStack(ModItems.Chain_Oblivion);
	}

	@Override
	public Map<Material, Integer> getRequirements () {
		Map<Material, Integer> reqs = new HashMap<Material, Integer>();
		reqs.put(MaterialRegistry.get(Strings.SM_DarkCrystal), 2);
		reqs.put(MaterialRegistry.get(Strings.SM_DarkGem), 4);
		reqs.put(MaterialRegistry.get(Strings.SM_DenseGem), 3);
		reqs.put(MaterialRegistry.get(Strings.SM_PowerStone), 5);
		return reqs;
	}

}
