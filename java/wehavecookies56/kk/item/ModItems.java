package wehavecookies56.kk.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Config;
import wehavecookies56.kk.lib.Reference;
import static wehavecookies56.kk.lib.Strings.*;
import wehavecookies56.kk.lib.Strings;

public class ModItems {
	
	public static Item
		AbaddonPlasma,
		AbyssalTide,
		AllforOne,
		AnguisForetellersKeyblade,
		AstralBlast,
		Aubade,
		BondofFlame,
		Brightcrest,
		ChaosRipper,
		CircleofLife,
		Counterpoint,
		Crabclaw,
		CrownofGuilt,
		DarkerThanDark,
		Darkgnaw,
		DecisivePumpkin,
		DestinysEmbrace,
		DiamondDust,
		Divewing,
		DivineRose,
		DreamSword,
		DualDisc,
		Earthshaker,
		EndofPain,
		EndsoftheEarth,
		FairyHarp,
		FairyStars,
		FatalCrest,
		Fenrir,
		FerrisGear,
		FollowtheWind,
		FrolicFlame,
		GlimpseofDarkness,
		GuardianBell,
		GuardianSoul,
		GullWing,
		HerosCrest,
		HiddenDragon,
		Hyperdrive,
		IncompleteKiblade,
		JungleKing,
		KeybladeofPeoplesHearts,
		Kiblade,
		KingdomKey,
		KingdomKeyD,
		KnockoutPunch,
		LadyLuck,
		LeasKeyblade,
		LeopardosForetellersKeyblade,
		Leviathan,
		Lionheart,
		LostMemory,
		LunarEclipse,
		MarkofaHero,
		MasterXehanortsKeyblade,
		MastersDefender,
		MaverickFlare,
		MetalChocobo,
		MidnightRoar,
		MissingAche,
		Monochrome,
		MysteriousAbyss,
		NoName,
		Oathkeeper,
		Oblivion,
		OceanRage,
		Olympia,
		OmegaWeapon,
		OminousBlight,
		OneWingedAngel,
		PainofSolitude,
		PhotonDebugger,
		PixiePetal,
		Pumpkinhead,
		Rainfell,
		RejectionofFate,
		RoyalRadiance,
		RumblingRose,
		SignofInnocence,
		SilentDirge,
		SkullNoise,
		SleepingLion,
		SoulEater,
		Spellbinder,
		StarSeeker,
		Starlight,
		Stormfall,
		StrokeofMidnight,
		SweetDreams,
		SweetMemories,
		Sweetstack,
		ThreeWishes,
		TotalEclipse,
		TreasureTrove,
		TrueLightsFlight,
		TwilightBlaze,
		TwoBecomeOne,
		UltimaWeaponKH1,
		UltimaWeaponKH2,
		UltimaWeaponBBS,
		UltimaWeaponDDD,
		Umbrella,
		Unbound,
		UnicornisForetellersKeyblade,
		UrsusForetellersKeyblade,
		VictoryLine,
		VoidGear,
		VulpeusForetellersKeyblade,
		WaytotheDawn,
		WaywardWind,
		WinnersProof,
		WishingLamp,
		WishingStar,
		WoodenKeyblade,
		WoodenStick,
		YoungXehanortsKeyblade,
		ZeroOne
	;
	
	public static Item munny;
	
	//CHAINS
	public static Item Chain_AbaddonPlasma;
	
	public static CreativeTabs tabKingdomKeys;
	
	public static void init(){
		tabKingdomKeys = new TabKingdomKeys(CreativeTabs.getNextID(), Strings.tabKingdomKeys);
		
		AbaddonPlasma = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_AbaddonPlasma[0], Integer.parseInt(Config.A_TM_AbaddonPlasma[1]), Integer.parseInt(Config.A_TM_AbaddonPlasma[2]), Float.parseFloat(Config.A_TM_AbaddonPlasma[3]), Float.parseFloat(Config.A_TM_AbaddonPlasma[4]), Integer.parseInt(Config.A_TM_AbaddonPlasma[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.AbaddonPlasma);
		AbyssalTide = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_AbyssalTide[0], Integer.parseInt(Config.A_TM_AbyssalTide[1]), Integer.parseInt(Config.A_TM_AbyssalTide[2]), Float.parseFloat(Config.A_TM_AbyssalTide[3]), Float.parseFloat(Config.A_TM_AbyssalTide[4]), Integer.parseInt(Config.A_TM_AbyssalTide[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.AbyssalTide);
		AllforOne = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_AllforOne[0], Integer.parseInt(Config.A_TM_AllforOne[1]), Integer.parseInt(Config.A_TM_AllforOne[2]), Float.parseFloat(Config.A_TM_AllforOne[3]), Float.parseFloat(Config.A_TM_AllforOne[4]), Integer.parseInt(Config.A_TM_AllforOne[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.AllforOne);
		AnguisForetellersKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_AnguisForetellersKeyblade[0], Integer.parseInt(Config.A_TM_AnguisForetellersKeyblade[1]), Integer.parseInt(Config.A_TM_AnguisForetellersKeyblade[2]), Float.parseFloat(Config.A_TM_AnguisForetellersKeyblade[3]), Float.parseFloat(Config.A_TM_AnguisForetellersKeyblade[4]), Integer.parseInt(Config.A_TM_AnguisForetellersKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.AnguisForetellersKeyblade);
		AstralBlast = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_AstralBlast[0], Integer.parseInt(Config.A_TM_AstralBlast[1]), Integer.parseInt(Config.A_TM_AstralBlast[2]), Float.parseFloat(Config.A_TM_AstralBlast[3]), Float.parseFloat(Config.A_TM_AstralBlast[4]), Integer.parseInt(Config.A_TM_AstralBlast[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.AstralBlast);
		Aubade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Aubade[0], Integer.parseInt(Config.A_TM_Aubade[1]), Integer.parseInt(Config.A_TM_Aubade[2]), Float.parseFloat(Config.A_TM_Aubade[3]), Float.parseFloat(Config.A_TM_Aubade[4]), Integer.parseInt(Config.A_TM_Aubade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Aubade);
		BondofFlame = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_BondofFlame[0], Integer.parseInt(Config.A_TM_BondofFlame[1]), Integer.parseInt(Config.A_TM_BondofFlame[2]), Float.parseFloat(Config.A_TM_BondofFlame[3]), Float.parseFloat(Config.A_TM_BondofFlame[4]), Integer.parseInt(Config.A_TM_BondofFlame[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.BondofFlame);
		Brightcrest = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Brightcrest[0], Integer.parseInt(Config.A_TM_Brightcrest[1]), Integer.parseInt(Config.A_TM_Brightcrest[2]), Float.parseFloat(Config.A_TM_Brightcrest[3]), Float.parseFloat(Config.A_TM_Brightcrest[4]), Integer.parseInt(Config.A_TM_Brightcrest[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Brightcrest);
		ChaosRipper = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_ChaosRipper[0], Integer.parseInt(Config.A_TM_ChaosRipper[1]), Integer.parseInt(Config.A_TM_ChaosRipper[2]), Float.parseFloat(Config.A_TM_ChaosRipper[3]), Float.parseFloat(Config.A_TM_ChaosRipper[4]), Integer.parseInt(Config.A_TM_ChaosRipper[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.ChaosRipper);
		CircleofLife = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_CircleofLife[0], Integer.parseInt(Config.A_TM_CircleofLife[1]), Integer.parseInt(Config.A_TM_CircleofLife[2]), Float.parseFloat(Config.A_TM_CircleofLife[3]), Float.parseFloat(Config.A_TM_CircleofLife[4]), Integer.parseInt(Config.A_TM_CircleofLife[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.CircleofLife);
		Counterpoint = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Counterpoint[0], Integer.parseInt(Config.A_TM_Counterpoint[1]), Integer.parseInt(Config.A_TM_Counterpoint[2]), Float.parseFloat(Config.A_TM_Counterpoint[3]), Float.parseFloat(Config.A_TM_Counterpoint[4]), Integer.parseInt(Config.A_TM_Counterpoint[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Counterpoint);
		Crabclaw = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Crabclaw[0], Integer.parseInt(Config.A_TM_Crabclaw[1]), Integer.parseInt(Config.A_TM_Crabclaw[2]), Float.parseFloat(Config.A_TM_Crabclaw[3]), Float.parseFloat(Config.A_TM_Crabclaw[4]), Integer.parseInt(Config.A_TM_Crabclaw[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Crabclaw);
		CrownofGuilt = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_CrownofGuilt[0], Integer.parseInt(Config.A_TM_CrownofGuilt[1]), Integer.parseInt(Config.A_TM_CrownofGuilt[2]), Float.parseFloat(Config.A_TM_CrownofGuilt[3]), Float.parseFloat(Config.A_TM_CrownofGuilt[4]), Integer.parseInt(Config.A_TM_CrownofGuilt[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.CrownofGuilt);
		DarkerThanDark = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DarkerThanDark[0], Integer.parseInt(Config.A_TM_DarkerThanDark[1]), Integer.parseInt(Config.A_TM_DarkerThanDark[2]), Float.parseFloat(Config.A_TM_DarkerThanDark[3]), Float.parseFloat(Config.A_TM_DarkerThanDark[4]), Integer.parseInt(Config.A_TM_DarkerThanDark[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DarkerThanDark);
		Darkgnaw = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Darkgnaw[0], Integer.parseInt(Config.A_TM_Darkgnaw[1]), Integer.parseInt(Config.A_TM_Darkgnaw[2]), Float.parseFloat(Config.A_TM_Darkgnaw[3]), Float.parseFloat(Config.A_TM_Darkgnaw[4]), Integer.parseInt(Config.A_TM_Darkgnaw[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Darkgnaw);
		DecisivePumpkin = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DecisivePumpkin[0], Integer.parseInt(Config.A_TM_DecisivePumpkin[1]), Integer.parseInt(Config.A_TM_DecisivePumpkin[2]), Float.parseFloat(Config.A_TM_DecisivePumpkin[3]), Float.parseFloat(Config.A_TM_DecisivePumpkin[4]), Integer.parseInt(Config.A_TM_DecisivePumpkin[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DecisivePumpkin);
		DestinysEmbrace = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DestinysEmbrace[0], Integer.parseInt(Config.A_TM_DestinysEmbrace[1]), Integer.parseInt(Config.A_TM_DestinysEmbrace[2]), Float.parseFloat(Config.A_TM_DestinysEmbrace[3]), Float.parseFloat(Config.A_TM_DestinysEmbrace[4]), Integer.parseInt(Config.A_TM_DestinysEmbrace[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DestinysEmbrace);
		DiamondDust = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DiamondDust[0], Integer.parseInt(Config.A_TM_DiamondDust[1]), Integer.parseInt(Config.A_TM_DiamondDust[2]), Float.parseFloat(Config.A_TM_DiamondDust[3]), Float.parseFloat(Config.A_TM_DiamondDust[4]), Integer.parseInt(Config.A_TM_DiamondDust[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DiamondDust);
		Divewing = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Divewing[0], Integer.parseInt(Config.A_TM_Divewing[1]), Integer.parseInt(Config.A_TM_Divewing[2]), Float.parseFloat(Config.A_TM_Divewing[3]), Float.parseFloat(Config.A_TM_Divewing[4]), Integer.parseInt(Config.A_TM_Divewing[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Divewing);
		DivineRose = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DivineRose[0], Integer.parseInt(Config.A_TM_DivineRose[1]), Integer.parseInt(Config.A_TM_DivineRose[2]), Float.parseFloat(Config.A_TM_DivineRose[3]), Float.parseFloat(Config.A_TM_DivineRose[4]), Integer.parseInt(Config.A_TM_DivineRose[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DivineRose);
		DreamSword = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DreamSword[0], Integer.parseInt(Config.A_TM_DreamSword[1]), Integer.parseInt(Config.A_TM_DreamSword[2]), Float.parseFloat(Config.A_TM_DreamSword[3]), Float.parseFloat(Config.A_TM_DreamSword[4]), Integer.parseInt(Config.A_TM_DreamSword[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DreamSword);
		DualDisc = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_DualDisc[0], Integer.parseInt(Config.A_TM_DualDisc[1]), Integer.parseInt(Config.A_TM_DualDisc[2]), Float.parseFloat(Config.A_TM_DualDisc[3]), Float.parseFloat(Config.A_TM_DualDisc[4]), Integer.parseInt(Config.A_TM_DualDisc[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.DualDisc);
		Earthshaker = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Earthshaker[0], Integer.parseInt(Config.A_TM_Earthshaker[1]), Integer.parseInt(Config.A_TM_Earthshaker[2]), Float.parseFloat(Config.A_TM_Earthshaker[3]), Float.parseFloat(Config.A_TM_Earthshaker[4]), Integer.parseInt(Config.A_TM_Earthshaker[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Earthshaker);
		EndofPain = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_EndofPain[0], Integer.parseInt(Config.A_TM_EndofPain[1]), Integer.parseInt(Config.A_TM_EndofPain[2]), Float.parseFloat(Config.A_TM_EndofPain[3]), Float.parseFloat(Config.A_TM_EndofPain[4]), Integer.parseInt(Config.A_TM_EndofPain[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.EndofPain);
		EndsoftheEarth = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_EndsoftheEarth[0], Integer.parseInt(Config.A_TM_EndsoftheEarth[1]), Integer.parseInt(Config.A_TM_EndsoftheEarth[2]), Float.parseFloat(Config.A_TM_EndsoftheEarth[3]), Float.parseFloat(Config.A_TM_EndsoftheEarth[4]), Integer.parseInt(Config.A_TM_EndsoftheEarth[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.EndsoftheEarth);
		FairyHarp = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_FairyHarp[0], Integer.parseInt(Config.A_TM_FairyHarp[1]), Integer.parseInt(Config.A_TM_FairyHarp[2]), Float.parseFloat(Config.A_TM_FairyHarp[3]), Float.parseFloat(Config.A_TM_FairyHarp[4]), Integer.parseInt(Config.A_TM_FairyHarp[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FairyHarp);
		FairyStars = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_FairyStars[0], Integer.parseInt(Config.A_TM_FairyStars[1]), Integer.parseInt(Config.A_TM_FairyStars[2]), Float.parseFloat(Config.A_TM_FairyStars[3]), Float.parseFloat(Config.A_TM_FairyStars[4]), Integer.parseInt(Config.A_TM_FairyStars[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FairyStars);
		FatalCrest = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_FatalCrest[0], Integer.parseInt(Config.A_TM_FatalCrest[1]), Integer.parseInt(Config.A_TM_FatalCrest[2]), Float.parseFloat(Config.A_TM_FatalCrest[3]), Float.parseFloat(Config.A_TM_FatalCrest[4]), Integer.parseInt(Config.A_TM_FatalCrest[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FatalCrest);
		Fenrir = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Fenrir[0], Integer.parseInt(Config.A_TM_Fenrir[1]), Integer.parseInt(Config.A_TM_Fenrir[2]), Float.parseFloat(Config.A_TM_Fenrir[3]), Float.parseFloat(Config.A_TM_Fenrir[4]), Integer.parseInt(Config.A_TM_Fenrir[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Fenrir);
		FerrisGear = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_FerrisGear[0], Integer.parseInt(Config.A_TM_FerrisGear[1]), Integer.parseInt(Config.A_TM_FerrisGear[2]), Float.parseFloat(Config.A_TM_FerrisGear[3]), Float.parseFloat(Config.A_TM_FerrisGear[4]), Integer.parseInt(Config.A_TM_FerrisGear[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FerrisGear);
		FollowtheWind = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_FollowtheWind[0], Integer.parseInt(Config.A_TM_FollowtheWind[1]), Integer.parseInt(Config.A_TM_FollowtheWind[2]), Float.parseFloat(Config.A_TM_FollowtheWind[3]), Float.parseFloat(Config.A_TM_FollowtheWind[4]), Integer.parseInt(Config.A_TM_FollowtheWind[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FollowtheWind);
		FrolicFlame = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_FrolicFlame[0], Integer.parseInt(Config.A_TM_FrolicFlame[1]), Integer.parseInt(Config.A_TM_FrolicFlame[2]), Float.parseFloat(Config.A_TM_FrolicFlame[3]), Float.parseFloat(Config.A_TM_FrolicFlame[4]), Integer.parseInt(Config.A_TM_FrolicFlame[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FrolicFlame);
		GlimpseofDarkness = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_GlimpseofDarkness[0], Integer.parseInt(Config.A_TM_GlimpseofDarkness[1]), Integer.parseInt(Config.A_TM_GlimpseofDarkness[2]), Float.parseFloat(Config.A_TM_GlimpseofDarkness[3]), Float.parseFloat(Config.A_TM_GlimpseofDarkness[4]), Integer.parseInt(Config.A_TM_GlimpseofDarkness[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.GlimpseofDarkness);
		GuardianBell = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_GuardianBell[0], Integer.parseInt(Config.A_TM_GuardianBell[1]), Integer.parseInt(Config.A_TM_GuardianBell[2]), Float.parseFloat(Config.A_TM_GuardianBell[3]), Float.parseFloat(Config.A_TM_GuardianBell[4]), Integer.parseInt(Config.A_TM_GuardianBell[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.GuardianBell);
		GuardianSoul = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_GuardianSoul[0], Integer.parseInt(Config.A_TM_GuardianSoul[1]), Integer.parseInt(Config.A_TM_GuardianSoul[2]), Float.parseFloat(Config.A_TM_GuardianSoul[3]), Float.parseFloat(Config.A_TM_GuardianSoul[4]), Integer.parseInt(Config.A_TM_GuardianSoul[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.GuardianSoul);
		GullWing = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_GullWing[0], Integer.parseInt(Config.A_TM_GullWing[1]), Integer.parseInt(Config.A_TM_GullWing[2]), Float.parseFloat(Config.A_TM_GullWing[3]), Float.parseFloat(Config.A_TM_GullWing[4]), Integer.parseInt(Config.A_TM_GullWing[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.GullWing);
		HerosCrest = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_HerosCrest[0], Integer.parseInt(Config.A_TM_HerosCrest[1]), Integer.parseInt(Config.A_TM_HerosCrest[2]), Float.parseFloat(Config.A_TM_HerosCrest[3]), Float.parseFloat(Config.A_TM_HerosCrest[4]), Integer.parseInt(Config.A_TM_HerosCrest[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.HerosCrest);
		HiddenDragon = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_HiddenDragon[0], Integer.parseInt(Config.A_TM_HiddenDragon[1]), Integer.parseInt(Config.A_TM_HiddenDragon[2]), Float.parseFloat(Config.A_TM_HiddenDragon[3]), Float.parseFloat(Config.A_TM_HiddenDragon[4]), Integer.parseInt(Config.A_TM_HiddenDragon[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.HiddenDragon);
		Hyperdrive = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Hyperdrive[0], Integer.parseInt(Config.A_TM_Hyperdrive[1]), Integer.parseInt(Config.A_TM_Hyperdrive[2]), Float.parseFloat(Config.A_TM_Hyperdrive[3]), Float.parseFloat(Config.A_TM_Hyperdrive[4]), Integer.parseInt(Config.A_TM_Hyperdrive[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Hyperdrive);
		IncompleteKiblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_IncompleteKiblade[0], Integer.parseInt(Config.A_TM_IncompleteKiblade[1]), Integer.parseInt(Config.A_TM_IncompleteKiblade[2]), Float.parseFloat(Config.A_TM_IncompleteKiblade[3]), Float.parseFloat(Config.A_TM_IncompleteKiblade[4]), Integer.parseInt(Config.A_TM_IncompleteKiblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.IncompleteKiblade);
		JungleKing = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_JungleKing[0], Integer.parseInt(Config.A_TM_JungleKing[1]), Integer.parseInt(Config.A_TM_JungleKing[2]), Float.parseFloat(Config.A_TM_JungleKing[3]), Float.parseFloat(Config.A_TM_JungleKing[4]), Integer.parseInt(Config.A_TM_JungleKing[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.JungleKing);
		KeybladeofPeoplesHearts = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_KeybladeofPeoplesHearts[0], Integer.parseInt(Config.A_TM_KeybladeofPeoplesHearts[1]), Integer.parseInt(Config.A_TM_KeybladeofPeoplesHearts[2]), Float.parseFloat(Config.A_TM_KeybladeofPeoplesHearts[3]), Float.parseFloat(Config.A_TM_KeybladeofPeoplesHearts[4]), Integer.parseInt(Config.A_TM_KeybladeofPeoplesHearts[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.KeybladeofPeoplesHearts);
		Kiblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Kiblade[0], Integer.parseInt(Config.A_TM_Kiblade[1]), Integer.parseInt(Config.A_TM_Kiblade[2]), Float.parseFloat(Config.A_TM_Kiblade[3]), Float.parseFloat(Config.A_TM_Kiblade[4]), Integer.parseInt(Config.A_TM_Kiblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Kiblade);
		KingdomKey = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_KingdomKey[0], Integer.parseInt(Config.A_TM_KingdomKey[1]), Integer.parseInt(Config.A_TM_KingdomKey[2]), Float.parseFloat(Config.A_TM_KingdomKey[3]), Float.parseFloat(Config.A_TM_KingdomKey[4]), Integer.parseInt(Config.A_TM_KingdomKey[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.KingdomKey);
		KingdomKeyD = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_KingdomKeyD[0], Integer.parseInt(Config.A_TM_KingdomKeyD[1]), Integer.parseInt(Config.A_TM_KingdomKeyD[2]), Float.parseFloat(Config.A_TM_KingdomKeyD[3]), Float.parseFloat(Config.A_TM_KingdomKeyD[4]), Integer.parseInt(Config.A_TM_KingdomKeyD[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.KingdomKeyD);
		KnockoutPunch = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_KnockoutPunch[0], Integer.parseInt(Config.A_TM_KnockoutPunch[1]), Integer.parseInt(Config.A_TM_KnockoutPunch[2]), Float.parseFloat(Config.A_TM_KnockoutPunch[3]), Float.parseFloat(Config.A_TM_KnockoutPunch[4]), Integer.parseInt(Config.A_TM_KnockoutPunch[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.KnockoutPunch);
		LadyLuck = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_LadyLuck[0], Integer.parseInt(Config.A_TM_LadyLuck[1]), Integer.parseInt(Config.A_TM_LadyLuck[2]), Float.parseFloat(Config.A_TM_LadyLuck[3]), Float.parseFloat(Config.A_TM_LadyLuck[4]), Integer.parseInt(Config.A_TM_LadyLuck[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.LadyLuck);
		LeasKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_LeasKeyblade[0], Integer.parseInt(Config.A_TM_LeasKeyblade[1]), Integer.parseInt(Config.A_TM_LeasKeyblade[2]), Float.parseFloat(Config.A_TM_LeasKeyblade[3]), Float.parseFloat(Config.A_TM_LeasKeyblade[4]), Integer.parseInt(Config.A_TM_LeasKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.LeasKeyblade);
		LeopardosForetellersKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_LeopardosForetellersKeyblade[0], Integer.parseInt(Config.A_TM_LeopardosForetellersKeyblade[1]), Integer.parseInt(Config.A_TM_LeopardosForetellersKeyblade[2]), Float.parseFloat(Config.A_TM_LeopardosForetellersKeyblade[3]), Float.parseFloat(Config.A_TM_LeopardosForetellersKeyblade[4]), Integer.parseInt(Config.A_TM_LeopardosForetellersKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.LeopardosForetellersKeyblade);
		Leviathan = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Leviathan[0], Integer.parseInt(Config.A_TM_Leviathan[1]), Integer.parseInt(Config.A_TM_Leviathan[2]), Float.parseFloat(Config.A_TM_Leviathan[3]), Float.parseFloat(Config.A_TM_Leviathan[4]), Integer.parseInt(Config.A_TM_Leviathan[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Leviathan);
		Lionheart = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Lionheart[0], Integer.parseInt(Config.A_TM_Lionheart[1]), Integer.parseInt(Config.A_TM_Lionheart[2]), Float.parseFloat(Config.A_TM_Lionheart[3]), Float.parseFloat(Config.A_TM_Lionheart[4]), Integer.parseInt(Config.A_TM_Lionheart[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Lionheart);
		LostMemory = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_LostMemory[0], Integer.parseInt(Config.A_TM_LostMemory[1]), Integer.parseInt(Config.A_TM_LostMemory[2]), Float.parseFloat(Config.A_TM_LostMemory[3]), Float.parseFloat(Config.A_TM_LostMemory[4]), Integer.parseInt(Config.A_TM_LostMemory[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.LostMemory);
		LunarEclipse = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_LunarEclipse[0], Integer.parseInt(Config.A_TM_LunarEclipse[1]), Integer.parseInt(Config.A_TM_LunarEclipse[2]), Float.parseFloat(Config.A_TM_LunarEclipse[3]), Float.parseFloat(Config.A_TM_LunarEclipse[4]), Integer.parseInt(Config.A_TM_LunarEclipse[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.LunarEclipse);
		MarkofaHero = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MarkofaHero[0], Integer.parseInt(Config.A_TM_MarkofaHero[1]), Integer.parseInt(Config.A_TM_MarkofaHero[2]), Float.parseFloat(Config.A_TM_MarkofaHero[3]), Float.parseFloat(Config.A_TM_MarkofaHero[4]), Integer.parseInt(Config.A_TM_MarkofaHero[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MarkofaHero);
		MasterXehanortsKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MasterXehanortsKeyblade[0], Integer.parseInt(Config.A_TM_MasterXehanortsKeyblade[1]), Integer.parseInt(Config.A_TM_MasterXehanortsKeyblade[2]), Float.parseFloat(Config.A_TM_MasterXehanortsKeyblade[3]), Float.parseFloat(Config.A_TM_MasterXehanortsKeyblade[4]), Integer.parseInt(Config.A_TM_MasterXehanortsKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MasterXehanortsKeyblade);
		MastersDefender = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MastersDefender[0], Integer.parseInt(Config.A_TM_MastersDefender[1]), Integer.parseInt(Config.A_TM_MastersDefender[2]), Float.parseFloat(Config.A_TM_MastersDefender[3]), Float.parseFloat(Config.A_TM_MastersDefender[4]), Integer.parseInt(Config.A_TM_MastersDefender[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MastersDefender);
		MaverickFlare = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MaverickFlare[0], Integer.parseInt(Config.A_TM_MaverickFlare[1]), Integer.parseInt(Config.A_TM_MaverickFlare[2]), Float.parseFloat(Config.A_TM_MaverickFlare[3]), Float.parseFloat(Config.A_TM_MaverickFlare[4]), Integer.parseInt(Config.A_TM_MaverickFlare[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MaverickFlare);
		MetalChocobo = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MetalChocobo[0], Integer.parseInt(Config.A_TM_MetalChocobo[1]), Integer.parseInt(Config.A_TM_MetalChocobo[2]), Float.parseFloat(Config.A_TM_MetalChocobo[3]), Float.parseFloat(Config.A_TM_MetalChocobo[4]), Integer.parseInt(Config.A_TM_MetalChocobo[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MetalChocobo);
		MidnightRoar = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MidnightRoar[0], Integer.parseInt(Config.A_TM_MidnightRoar[1]), Integer.parseInt(Config.A_TM_MidnightRoar[2]), Float.parseFloat(Config.A_TM_MidnightRoar[3]), Float.parseFloat(Config.A_TM_MidnightRoar[4]), Integer.parseInt(Config.A_TM_MidnightRoar[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MidnightRoar);
		MissingAche = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MissingAche[0], Integer.parseInt(Config.A_TM_MissingAche[1]), Integer.parseInt(Config.A_TM_MissingAche[2]), Float.parseFloat(Config.A_TM_MissingAche[3]), Float.parseFloat(Config.A_TM_MissingAche[4]), Integer.parseInt(Config.A_TM_MissingAche[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MissingAche);
		Monochrome = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Monochrome[0], Integer.parseInt(Config.A_TM_Monochrome[1]), Integer.parseInt(Config.A_TM_Monochrome[2]), Float.parseFloat(Config.A_TM_Monochrome[3]), Float.parseFloat(Config.A_TM_Monochrome[4]), Integer.parseInt(Config.A_TM_Monochrome[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Monochrome);
		MysteriousAbyss = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_MysteriousAbyss[0], Integer.parseInt(Config.A_TM_MysteriousAbyss[1]), Integer.parseInt(Config.A_TM_MysteriousAbyss[2]), Float.parseFloat(Config.A_TM_MysteriousAbyss[3]), Float.parseFloat(Config.A_TM_MysteriousAbyss[4]), Integer.parseInt(Config.A_TM_MysteriousAbyss[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.MysteriousAbyss);
		NoName = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_NoName[0], Integer.parseInt(Config.A_TM_NoName[1]), Integer.parseInt(Config.A_TM_NoName[2]), Float.parseFloat(Config.A_TM_NoName[3]), Float.parseFloat(Config.A_TM_NoName[4]), Integer.parseInt(Config.A_TM_NoName[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.NoName);
		Oathkeeper = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Oathkeeper[0], Integer.parseInt(Config.A_TM_Oathkeeper[1]), Integer.parseInt(Config.A_TM_Oathkeeper[2]), Float.parseFloat(Config.A_TM_Oathkeeper[3]), Float.parseFloat(Config.A_TM_Oathkeeper[4]), Integer.parseInt(Config.A_TM_Oathkeeper[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Oathkeeper);
		Oblivion = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Oblivion[0], Integer.parseInt(Config.A_TM_Oblivion[1]), Integer.parseInt(Config.A_TM_Oblivion[2]), Float.parseFloat(Config.A_TM_Oblivion[3]), Float.parseFloat(Config.A_TM_Oblivion[4]), Integer.parseInt(Config.A_TM_Oblivion[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Oblivion);
		OceanRage = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_OceanRage[0], Integer.parseInt(Config.A_TM_OceanRage[1]), Integer.parseInt(Config.A_TM_OceanRage[2]), Float.parseFloat(Config.A_TM_OceanRage[3]), Float.parseFloat(Config.A_TM_OceanRage[4]), Integer.parseInt(Config.A_TM_OceanRage[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.OceanRage);
		Olympia = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Olympia[0], Integer.parseInt(Config.A_TM_Olympia[1]), Integer.parseInt(Config.A_TM_Olympia[2]), Float.parseFloat(Config.A_TM_Olympia[3]), Float.parseFloat(Config.A_TM_Olympia[4]), Integer.parseInt(Config.A_TM_Olympia[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Olympia);
		OmegaWeapon = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_OmegaWeapon[0], Integer.parseInt(Config.A_TM_OmegaWeapon[1]), Integer.parseInt(Config.A_TM_OmegaWeapon[2]), Float.parseFloat(Config.A_TM_OmegaWeapon[3]), Float.parseFloat(Config.A_TM_OmegaWeapon[4]), Integer.parseInt(Config.A_TM_OmegaWeapon[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.OmegaWeapon);
		OminousBlight = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_OminousBlight[0], Integer.parseInt(Config.A_TM_OminousBlight[1]), Integer.parseInt(Config.A_TM_OminousBlight[2]), Float.parseFloat(Config.A_TM_OminousBlight[3]), Float.parseFloat(Config.A_TM_OminousBlight[4]), Integer.parseInt(Config.A_TM_OminousBlight[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.OminousBlight);
		OneWingedAngel = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_OneWingedAngel[0], Integer.parseInt(Config.A_TM_OneWingedAngel[1]), Integer.parseInt(Config.A_TM_OneWingedAngel[2]), Float.parseFloat(Config.A_TM_OneWingedAngel[3]), Float.parseFloat(Config.A_TM_OneWingedAngel[4]), Integer.parseInt(Config.A_TM_OneWingedAngel[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.OneWingedAngel);
		PainofSolitude = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_PainofSolitude[0], Integer.parseInt(Config.A_TM_PainofSolitude[1]), Integer.parseInt(Config.A_TM_PainofSolitude[2]), Float.parseFloat(Config.A_TM_PainofSolitude[3]), Float.parseFloat(Config.A_TM_PainofSolitude[4]), Integer.parseInt(Config.A_TM_PainofSolitude[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.PainofSolitude);
		PhotonDebugger = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_PhotonDebugger[0], Integer.parseInt(Config.A_TM_PhotonDebugger[1]), Integer.parseInt(Config.A_TM_PhotonDebugger[2]), Float.parseFloat(Config.A_TM_PhotonDebugger[3]), Float.parseFloat(Config.A_TM_PhotonDebugger[4]), Integer.parseInt(Config.A_TM_PhotonDebugger[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.PhotonDebugger);
		PixiePetal = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_PixiePetal[0], Integer.parseInt(Config.A_TM_PixiePetal[1]), Integer.parseInt(Config.A_TM_PixiePetal[2]), Float.parseFloat(Config.A_TM_PixiePetal[3]), Float.parseFloat(Config.A_TM_PixiePetal[4]), Integer.parseInt(Config.A_TM_PixiePetal[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.PixiePetal);
		Pumpkinhead = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Pumpkinhead[0], Integer.parseInt(Config.A_TM_Pumpkinhead[1]), Integer.parseInt(Config.A_TM_Pumpkinhead[2]), Float.parseFloat(Config.A_TM_Pumpkinhead[3]), Float.parseFloat(Config.A_TM_Pumpkinhead[4]), Integer.parseInt(Config.A_TM_Pumpkinhead[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Pumpkinhead);
		Rainfell = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Rainfell[0], Integer.parseInt(Config.A_TM_Rainfell[1]), Integer.parseInt(Config.A_TM_Rainfell[2]), Float.parseFloat(Config.A_TM_Rainfell[3]), Float.parseFloat(Config.A_TM_Rainfell[4]), Integer.parseInt(Config.A_TM_Rainfell[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Rainfell);
		RejectionofFate = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_RejectionofFate[0], Integer.parseInt(Config.A_TM_RejectionofFate[1]), Integer.parseInt(Config.A_TM_RejectionofFate[2]), Float.parseFloat(Config.A_TM_RejectionofFate[3]), Float.parseFloat(Config.A_TM_RejectionofFate[4]), Integer.parseInt(Config.A_TM_RejectionofFate[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.RejectionofFate);
		RoyalRadiance = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_RoyalRadiance[0], Integer.parseInt(Config.A_TM_RoyalRadiance[1]), Integer.parseInt(Config.A_TM_RoyalRadiance[2]), Float.parseFloat(Config.A_TM_RoyalRadiance[3]), Float.parseFloat(Config.A_TM_RoyalRadiance[4]), Integer.parseInt(Config.A_TM_RoyalRadiance[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.RoyalRadiance);
		RumblingRose = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_RumblingRose[0], Integer.parseInt(Config.A_TM_RumblingRose[1]), Integer.parseInt(Config.A_TM_RumblingRose[2]), Float.parseFloat(Config.A_TM_RumblingRose[3]), Float.parseFloat(Config.A_TM_RumblingRose[4]), Integer.parseInt(Config.A_TM_RumblingRose[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.RumblingRose);
		SignofInnocence = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SignofInnocence[0], Integer.parseInt(Config.A_TM_SignofInnocence[1]), Integer.parseInt(Config.A_TM_SignofInnocence[2]), Float.parseFloat(Config.A_TM_SignofInnocence[3]), Float.parseFloat(Config.A_TM_SignofInnocence[4]), Integer.parseInt(Config.A_TM_SignofInnocence[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SignofInnocence);
		SilentDirge = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SilentDirge[0], Integer.parseInt(Config.A_TM_SilentDirge[1]), Integer.parseInt(Config.A_TM_SilentDirge[2]), Float.parseFloat(Config.A_TM_SilentDirge[3]), Float.parseFloat(Config.A_TM_SilentDirge[4]), Integer.parseInt(Config.A_TM_SilentDirge[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SilentDirge);
		SkullNoise = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SkullNoise[0], Integer.parseInt(Config.A_TM_SkullNoise[1]), Integer.parseInt(Config.A_TM_SkullNoise[2]), Float.parseFloat(Config.A_TM_SkullNoise[3]), Float.parseFloat(Config.A_TM_SkullNoise[4]), Integer.parseInt(Config.A_TM_SkullNoise[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SkullNoise);
		SleepingLion = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SleepingLion[0], Integer.parseInt(Config.A_TM_SleepingLion[1]), Integer.parseInt(Config.A_TM_SleepingLion[2]), Float.parseFloat(Config.A_TM_SleepingLion[3]), Float.parseFloat(Config.A_TM_SleepingLion[4]), Integer.parseInt(Config.A_TM_SleepingLion[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SleepingLion);
		SoulEater = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SoulEater[0], Integer.parseInt(Config.A_TM_SoulEater[1]), Integer.parseInt(Config.A_TM_SoulEater[2]), Float.parseFloat(Config.A_TM_SoulEater[3]), Float.parseFloat(Config.A_TM_SoulEater[4]), Integer.parseInt(Config.A_TM_SoulEater[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SoulEater);
		Spellbinder = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Spellbinder[0], Integer.parseInt(Config.A_TM_Spellbinder[1]), Integer.parseInt(Config.A_TM_Spellbinder[2]), Float.parseFloat(Config.A_TM_Spellbinder[3]), Float.parseFloat(Config.A_TM_Spellbinder[4]), Integer.parseInt(Config.A_TM_Spellbinder[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Spellbinder);
		Starlight = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Starlight[0], Integer.parseInt(Config.A_TM_Starlight[1]), Integer.parseInt(Config.A_TM_Starlight[2]), Float.parseFloat(Config.A_TM_Starlight[3]), Float.parseFloat(Config.A_TM_Starlight[4]), Integer.parseInt(Config.A_TM_Starlight[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Starlight);
		StarSeeker = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_StarSeeker[0], Integer.parseInt(Config.A_TM_StarSeeker[1]), Integer.parseInt(Config.A_TM_StarSeeker[2]), Float.parseFloat(Config.A_TM_StarSeeker[3]), Float.parseFloat(Config.A_TM_StarSeeker[4]), Integer.parseInt(Config.A_TM_StarSeeker[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.StarSeeker);
		Stormfall = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Stormfall[0], Integer.parseInt(Config.A_TM_Stormfall[1]), Integer.parseInt(Config.A_TM_Stormfall[2]), Float.parseFloat(Config.A_TM_Stormfall[3]), Float.parseFloat(Config.A_TM_Stormfall[4]), Integer.parseInt(Config.A_TM_Stormfall[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Stormfall);
		StrokeofMidnight = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_StrokeofMidnight[0], Integer.parseInt(Config.A_TM_StrokeofMidnight[1]), Integer.parseInt(Config.A_TM_StrokeofMidnight[2]), Float.parseFloat(Config.A_TM_StrokeofMidnight[3]), Float.parseFloat(Config.A_TM_StrokeofMidnight[4]), Integer.parseInt(Config.A_TM_StrokeofMidnight[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.StrokeofMidnight);
		SweetDreams = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SweetDreams[0], Integer.parseInt(Config.A_TM_SweetDreams[1]), Integer.parseInt(Config.A_TM_SweetDreams[2]), Float.parseFloat(Config.A_TM_SweetDreams[3]), Float.parseFloat(Config.A_TM_SweetDreams[4]), Integer.parseInt(Config.A_TM_SweetDreams[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SweetDreams);
		SweetMemories = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_SweetMemories[0], Integer.parseInt(Config.A_TM_SweetMemories[1]), Integer.parseInt(Config.A_TM_SweetMemories[2]), Float.parseFloat(Config.A_TM_SweetMemories[3]), Float.parseFloat(Config.A_TM_SweetMemories[4]), Integer.parseInt(Config.A_TM_SweetMemories[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.SweetMemories);
		Sweetstack = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Sweetstack[0], Integer.parseInt(Config.A_TM_Sweetstack[1]), Integer.parseInt(Config.A_TM_Sweetstack[2]), Float.parseFloat(Config.A_TM_Sweetstack[3]), Float.parseFloat(Config.A_TM_Sweetstack[4]), Integer.parseInt(Config.A_TM_Sweetstack[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Sweetstack);
		ThreeWishes = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_ThreeWishes[0], Integer.parseInt(Config.A_TM_ThreeWishes[1]), Integer.parseInt(Config.A_TM_ThreeWishes[2]), Float.parseFloat(Config.A_TM_ThreeWishes[3]), Float.parseFloat(Config.A_TM_ThreeWishes[4]), Integer.parseInt(Config.A_TM_ThreeWishes[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.ThreeWishes);
		TotalEclipse = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_TotalEclipse[0], Integer.parseInt(Config.A_TM_TotalEclipse[1]), Integer.parseInt(Config.A_TM_TotalEclipse[2]), Float.parseFloat(Config.A_TM_TotalEclipse[3]), Float.parseFloat(Config.A_TM_TotalEclipse[4]), Integer.parseInt(Config.A_TM_TotalEclipse[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TotalEclipse);
		TreasureTrove = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_TreasureTrove[0], Integer.parseInt(Config.A_TM_TreasureTrove[1]), Integer.parseInt(Config.A_TM_TreasureTrove[2]), Float.parseFloat(Config.A_TM_TreasureTrove[3]), Float.parseFloat(Config.A_TM_TreasureTrove[4]), Integer.parseInt(Config.A_TM_TreasureTrove[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TreasureTrove);
		TrueLightsFlight = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_TrueLightsFlight[0], Integer.parseInt(Config.A_TM_TrueLightsFlight[1]), Integer.parseInt(Config.A_TM_TrueLightsFlight[2]), Float.parseFloat(Config.A_TM_TrueLightsFlight[3]), Float.parseFloat(Config.A_TM_TrueLightsFlight[4]), Integer.parseInt(Config.A_TM_TrueLightsFlight[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TrueLightsFlight);
		TwilightBlaze = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_TwilightBlaze[0], Integer.parseInt(Config.A_TM_TwilightBlaze[1]), Integer.parseInt(Config.A_TM_TwilightBlaze[2]), Float.parseFloat(Config.A_TM_TwilightBlaze[3]), Float.parseFloat(Config.A_TM_TwilightBlaze[4]), Integer.parseInt(Config.A_TM_TwilightBlaze[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TwilightBlaze);
		TwoBecomeOne = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_TwoBecomeOne[0], Integer.parseInt(Config.A_TM_TwoBecomeOne[1]), Integer.parseInt(Config.A_TM_TwoBecomeOne[2]), Float.parseFloat(Config.A_TM_TwoBecomeOne[3]), Float.parseFloat(Config.A_TM_TwoBecomeOne[4]), Integer.parseInt(Config.A_TM_TwoBecomeOne[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TwoBecomeOne);
		UltimaWeaponKH1 = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_UltimaWeaponKH1[0], Integer.parseInt(Config.A_TM_UltimaWeaponKH1[1]), Integer.parseInt(Config.A_TM_UltimaWeaponKH1[2]), Float.parseFloat(Config.A_TM_UltimaWeaponKH1[3]), Float.parseFloat(Config.A_TM_UltimaWeaponKH1[4]), Integer.parseInt(Config.A_TM_UltimaWeaponKH1[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.UltimaWeaponKH1);
		UltimaWeaponKH2 = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_UltimaWeaponKH2[0], Integer.parseInt(Config.A_TM_UltimaWeaponKH2[1]), Integer.parseInt(Config.A_TM_UltimaWeaponKH2[2]), Float.parseFloat(Config.A_TM_UltimaWeaponKH2[3]), Float.parseFloat(Config.A_TM_UltimaWeaponKH2[4]), Integer.parseInt(Config.A_TM_UltimaWeaponKH2[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.UltimaWeaponKH2);
		UltimaWeaponBBS = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_UltimaWeaponBBS[0], Integer.parseInt(Config.A_TM_UltimaWeaponBBS[1]), Integer.parseInt(Config.A_TM_UltimaWeaponBBS[2]), Float.parseFloat(Config.A_TM_UltimaWeaponBBS[3]), Float.parseFloat(Config.A_TM_UltimaWeaponBBS[4]), Integer.parseInt(Config.A_TM_UltimaWeaponBBS[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.UltimaWeaponBBS);
		UltimaWeaponDDD = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_UltimaWeaponDDD[0], Integer.parseInt(Config.A_TM_UltimaWeaponDDD[1]), Integer.parseInt(Config.A_TM_UltimaWeaponDDD[2]), Float.parseFloat(Config.A_TM_UltimaWeaponDDD[3]), Float.parseFloat(Config.A_TM_UltimaWeaponDDD[4]), Integer.parseInt(Config.A_TM_UltimaWeaponDDD[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.UltimaWeaponDDD);
		Umbrella = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Umbrella[0], Integer.parseInt(Config.A_TM_Umbrella[1]), Integer.parseInt(Config.A_TM_Umbrella[2]), Float.parseFloat(Config.A_TM_Umbrella[3]), Float.parseFloat(Config.A_TM_Umbrella[4]), Integer.parseInt(Config.A_TM_Umbrella[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Umbrella);
		Unbound = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_Unbound[0], Integer.parseInt(Config.A_TM_Unbound[1]), Integer.parseInt(Config.A_TM_Unbound[2]), Float.parseFloat(Config.A_TM_Unbound[3]), Float.parseFloat(Config.A_TM_Unbound[4]), Integer.parseInt(Config.A_TM_Unbound[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Unbound);
		UnicornisForetellersKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_UnicornisForetellersKeyblade[0], Integer.parseInt(Config.A_TM_UnicornisForetellersKeyblade[1]), Integer.parseInt(Config.A_TM_UnicornisForetellersKeyblade[2]), Float.parseFloat(Config.A_TM_UnicornisForetellersKeyblade[3]), Float.parseFloat(Config.A_TM_UnicornisForetellersKeyblade[4]), Integer.parseInt(Config.A_TM_UnicornisForetellersKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.UnicornisForetellersKeyblade);
		UrsusForetellersKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_UrsusForetellersKeyblade[0], Integer.parseInt(Config.A_TM_UrsusForetellersKeyblade[1]), Integer.parseInt(Config.A_TM_UrsusForetellersKeyblade[2]), Float.parseFloat(Config.A_TM_UrsusForetellersKeyblade[3]), Float.parseFloat(Config.A_TM_UrsusForetellersKeyblade[4]), Integer.parseInt(Config.A_TM_UrsusForetellersKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.UrsusForetellersKeyblade);
		VictoryLine = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_VictoryLine[0], Integer.parseInt(Config.A_TM_VictoryLine[1]), Integer.parseInt(Config.A_TM_VictoryLine[2]), Float.parseFloat(Config.A_TM_VictoryLine[3]), Float.parseFloat(Config.A_TM_VictoryLine[4]), Integer.parseInt(Config.A_TM_VictoryLine[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.VictoryLine);
		VoidGear = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_VoidGear[0], Integer.parseInt(Config.A_TM_VoidGear[1]), Integer.parseInt(Config.A_TM_VoidGear[2]), Float.parseFloat(Config.A_TM_VoidGear[3]), Float.parseFloat(Config.A_TM_VoidGear[4]), Integer.parseInt(Config.A_TM_VoidGear[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.VoidGear);
		VulpeusForetellersKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_VulpeusForetellersKeyblade[0], Integer.parseInt(Config.A_TM_VulpeusForetellersKeyblade[1]), Integer.parseInt(Config.A_TM_VulpeusForetellersKeyblade[2]), Float.parseFloat(Config.A_TM_VulpeusForetellersKeyblade[3]), Float.parseFloat(Config.A_TM_VulpeusForetellersKeyblade[4]), Integer.parseInt(Config.A_TM_VulpeusForetellersKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.VulpeusForetellersKeyblade);
		WaytotheDawn = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WaytotheDawn[0], Integer.parseInt(Config.A_TM_WaytotheDawn[1]), Integer.parseInt(Config.A_TM_WaytotheDawn[2]), Float.parseFloat(Config.A_TM_WaytotheDawn[3]), Float.parseFloat(Config.A_TM_WaytotheDawn[4]), Integer.parseInt(Config.A_TM_WaytotheDawn[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WaytotheDawn);
		WaywardWind = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WaywardWind[0], Integer.parseInt(Config.A_TM_WaywardWind[1]), Integer.parseInt(Config.A_TM_WaywardWind[2]), Float.parseFloat(Config.A_TM_WaywardWind[3]), Float.parseFloat(Config.A_TM_WaywardWind[4]), Integer.parseInt(Config.A_TM_WaywardWind[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WaywardWind);
		WinnersProof = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WinnersProof[0], Integer.parseInt(Config.A_TM_WinnersProof[1]), Integer.parseInt(Config.A_TM_WinnersProof[2]), Float.parseFloat(Config.A_TM_WinnersProof[3]), Float.parseFloat(Config.A_TM_WinnersProof[4]), Integer.parseInt(Config.A_TM_WinnersProof[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WinnersProof);
		WishingLamp = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WishingLamp[0], Integer.parseInt(Config.A_TM_WishingLamp[1]), Integer.parseInt(Config.A_TM_WishingLamp[2]), Float.parseFloat(Config.A_TM_WishingLamp[3]), Float.parseFloat(Config.A_TM_WishingLamp[4]), Integer.parseInt(Config.A_TM_WishingLamp[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WishingLamp);
		WishingStar = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WishingStar[0], Integer.parseInt(Config.A_TM_WishingStar[1]), Integer.parseInt(Config.A_TM_WishingStar[2]), Float.parseFloat(Config.A_TM_WishingStar[3]), Float.parseFloat(Config.A_TM_WishingStar[4]), Integer.parseInt(Config.A_TM_WishingStar[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WishingStar);
		WoodenKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WoodenKeyblade[0], Integer.parseInt(Config.A_TM_WoodenKeyblade[1]), Integer.parseInt(Config.A_TM_WoodenKeyblade[2]), Float.parseFloat(Config.A_TM_WoodenKeyblade[3]), Float.parseFloat(Config.A_TM_WoodenKeyblade[4]), Integer.parseInt(Config.A_TM_WoodenKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WoodenKeyblade);
		WoodenStick = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_WoodenStick[0], Integer.parseInt(Config.A_TM_WoodenStick[1]), Integer.parseInt(Config.A_TM_WoodenStick[2]), Float.parseFloat(Config.A_TM_WoodenStick[3]), Float.parseFloat(Config.A_TM_WoodenStick[4]), Integer.parseInt(Config.A_TM_WoodenStick[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.WoodenStick);
		YoungXehanortsKeyblade = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_YoungXehanortsKeyblade[0], Integer.parseInt(Config.A_TM_YoungXehanortsKeyblade[1]), Integer.parseInt(Config.A_TM_YoungXehanortsKeyblade[2]), Float.parseFloat(Config.A_TM_YoungXehanortsKeyblade[3]), Float.parseFloat(Config.A_TM_YoungXehanortsKeyblade[4]), Integer.parseInt(Config.A_TM_YoungXehanortsKeyblade[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.YoungXehanortsKeyblade);
		ZeroOne = new ItemSword(EnumHelper.addToolMaterial(Config.A_TM_ZeroOne[0], Integer.parseInt(Config.A_TM_ZeroOne[1]), Integer.parseInt(Config.A_TM_ZeroOne[2]), Float.parseFloat(Config.A_TM_ZeroOne[3]), Float.parseFloat(Config.A_TM_ZeroOne[4]), Integer.parseInt(Config.A_TM_ZeroOne[5]))).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.ZeroOne);

		//CHAINS
		Chain_AbaddonPlasma = new Item().setUnlocalizedName(Strings.Chain_AbaddonPlasma).setCreativeTab(tabKingdomKeys);
		
	}
	
	public static void initItemSword(Item item, String[] toolmaterial, String name, CreativeTabs tab){
		item = new ItemSword(EnumHelper.addToolMaterial(toolmaterial[0], Integer.parseInt(toolmaterial[1]), Integer.parseInt(toolmaterial[2]), Float.parseFloat(toolmaterial[3]), Float.parseFloat(toolmaterial[4]), Integer.parseInt(toolmaterial[5]))).setUnlocalizedName(name).setCreativeTab(tab);
	}
	
	public static void registerItem(Item item){
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void register(){
		GameRegistry.registerItem(AbaddonPlasma, Strings.AbaddonPlasma);
		GameRegistry.registerItem(AbyssalTide, Strings.AbyssalTide);
		GameRegistry.registerItem(AllforOne, Strings.AllforOne);
		GameRegistry.registerItem(AnguisForetellersKeyblade, Strings.AnguisForetellersKeyblade);
		GameRegistry.registerItem(AstralBlast, Strings.AstralBlast);
		GameRegistry.registerItem(Aubade, Strings.Aubade);
		GameRegistry.registerItem(BondofFlame, Strings.BondofFlame);
		GameRegistry.registerItem(Brightcrest, Strings.Brightcrest);
		GameRegistry.registerItem(ChaosRipper, Strings.ChaosRipper);
		GameRegistry.registerItem(CircleofLife, Strings.CircleofLife);
		GameRegistry.registerItem(Counterpoint, Strings.Counterpoint);
		GameRegistry.registerItem(Crabclaw, Strings.Crabclaw);
		GameRegistry.registerItem(CrownofGuilt, Strings.CrownofGuilt);
		GameRegistry.registerItem(DarkerThanDark, Strings.DarkerThanDark);
		GameRegistry.registerItem(Darkgnaw, Strings.Darkgnaw);
		GameRegistry.registerItem(DecisivePumpkin, Strings.DecisivePumpkin);
		GameRegistry.registerItem(DestinysEmbrace, Strings.DestinysEmbrace);
		GameRegistry.registerItem(DiamondDust, Strings.DiamondDust);
		GameRegistry.registerItem(Divewing, Strings.Divewing);
		GameRegistry.registerItem(DivineRose, Strings.DivineRose);
		GameRegistry.registerItem(DreamSword, Strings.DreamSword);
		GameRegistry.registerItem(DualDisc, Strings.DualDisc);
		GameRegistry.registerItem(Earthshaker, Strings.Earthshaker);
		GameRegistry.registerItem(EndofPain, Strings.EndofPain);
		GameRegistry.registerItem(EndsoftheEarth, Strings.EndsoftheEarth);
		GameRegistry.registerItem(FairyHarp, Strings.FairyHarp);
		GameRegistry.registerItem(FairyStars, Strings.FairyStars);
		GameRegistry.registerItem(FatalCrest, Strings.FatalCrest);
		GameRegistry.registerItem(Fenrir, Strings.Fenrir);
		GameRegistry.registerItem(FerrisGear, Strings.FerrisGear);
		GameRegistry.registerItem(FollowtheWind, Strings.FollowtheWind);
		GameRegistry.registerItem(FrolicFlame, Strings.FrolicFlame);
		GameRegistry.registerItem(GlimpseofDarkness, Strings.GlimpseofDarkness);
		GameRegistry.registerItem(GuardianBell, Strings.GuardianBell);
		GameRegistry.registerItem(GuardianSoul, Strings.GuardianSoul);
		GameRegistry.registerItem(GullWing, Strings.GullWing);
		GameRegistry.registerItem(HerosCrest, Strings.HerosCrest);
		GameRegistry.registerItem(HiddenDragon, Strings.HiddenDragon);
		GameRegistry.registerItem(Hyperdrive, Strings.Hyperdrive);
		GameRegistry.registerItem(IncompleteKiblade, Strings.IncompleteKiblade);
		GameRegistry.registerItem(JungleKing, Strings.JungleKing);
		GameRegistry.registerItem(KeybladeofPeoplesHearts, Strings.KeybladeofPeoplesHearts);
		GameRegistry.registerItem(Kiblade, Strings.Kiblade);
		GameRegistry.registerItem(KingdomKey, Strings.KingdomKey);
		GameRegistry.registerItem(KingdomKeyD, Strings.KingdomKeyD);
		GameRegistry.registerItem(KnockoutPunch, Strings.KnockoutPunch);
		GameRegistry.registerItem(LadyLuck, Strings.LadyLuck);
		GameRegistry.registerItem(LeasKeyblade, Strings.LeasKeyblade);
		GameRegistry.registerItem(LeopardosForetellersKeyblade, Strings.LeopardosForetellersKeyblade);
		GameRegistry.registerItem(Leviathan, Strings.Leviathan);
		GameRegistry.registerItem(Lionheart, Strings.Lionheart);
		GameRegistry.registerItem(LostMemory, Strings.LostMemory);
		GameRegistry.registerItem(LunarEclipse, Strings.LunarEclipse);
		GameRegistry.registerItem(MarkofaHero, Strings.MarkofaHero);
		GameRegistry.registerItem(MasterXehanortsKeyblade, Strings.MasterXehanortsKeyblade);
		GameRegistry.registerItem(MastersDefender, Strings.MastersDefender);
		GameRegistry.registerItem(MaverickFlare, Strings.MaverickFlare);
		GameRegistry.registerItem(MetalChocobo, Strings.MetalChocobo);
		GameRegistry.registerItem(MidnightRoar, Strings.MidnightRoar);
		GameRegistry.registerItem(MissingAche, Strings.MissingAche);
		GameRegistry.registerItem(Monochrome, Strings.Monochrome);
		GameRegistry.registerItem(MysteriousAbyss, Strings.MysteriousAbyss);
		GameRegistry.registerItem(NoName, Strings.NoName);
		GameRegistry.registerItem(Oathkeeper, Strings.Oathkeeper);
		GameRegistry.registerItem(Oblivion, Strings.Oblivion);
		GameRegistry.registerItem(OceanRage, Strings.OceanRage);
		GameRegistry.registerItem(Olympia, Strings.Olympia);
		GameRegistry.registerItem(OmegaWeapon, Strings.OmegaWeapon);
		GameRegistry.registerItem(OminousBlight, Strings.OminousBlight);
		GameRegistry.registerItem(OneWingedAngel, Strings.OneWingedAngel);
		GameRegistry.registerItem(PainofSolitude, Strings.PainofSolitude);
		GameRegistry.registerItem(PhotonDebugger, Strings.PhotonDebugger);
		GameRegistry.registerItem(PixiePetal, Strings.PixiePetal);
		GameRegistry.registerItem(Pumpkinhead, Strings.Pumpkinhead);
		GameRegistry.registerItem(Rainfell, Strings.Rainfell);
		GameRegistry.registerItem(RejectionofFate, Strings.RejectionofFate);
		GameRegistry.registerItem(RoyalRadiance, Strings.RoyalRadiance);
		GameRegistry.registerItem(RumblingRose, Strings.RumblingRose);
		GameRegistry.registerItem(SignofInnocence, Strings.SignofInnocence);
		GameRegistry.registerItem(SilentDirge, Strings.SilentDirge);
		GameRegistry.registerItem(SkullNoise, Strings.SkullNoise);
		GameRegistry.registerItem(SleepingLion, Strings.SleepingLion);
		GameRegistry.registerItem(SoulEater, Strings.SoulEater);
		GameRegistry.registerItem(Spellbinder, Strings.Spellbinder);
		GameRegistry.registerItem(StarSeeker, Strings.StarSeeker);
		GameRegistry.registerItem(Starlight, Strings.Starlight);
		GameRegistry.registerItem(Stormfall, Strings.Stormfall);
		GameRegistry.registerItem(StrokeofMidnight, Strings.StrokeofMidnight);
		GameRegistry.registerItem(SweetDreams, Strings.SweetDreams);
		GameRegistry.registerItem(SweetMemories, Strings.SweetMemories);
		GameRegistry.registerItem(Sweetstack, Strings.Sweetstack);
		GameRegistry.registerItem(ThreeWishes, Strings.ThreeWishes);
		GameRegistry.registerItem(TotalEclipse, Strings.TotalEclipse);
		GameRegistry.registerItem(TreasureTrove, Strings.TreasureTrove);
		GameRegistry.registerItem(TrueLightsFlight, Strings.TrueLightsFlight);
		GameRegistry.registerItem(TwilightBlaze, Strings.TwilightBlaze);
		GameRegistry.registerItem(TwoBecomeOne, Strings.TwoBecomeOne);
		GameRegistry.registerItem(UltimaWeaponKH1, Strings.UltimaWeaponKH1);
		GameRegistry.registerItem(UltimaWeaponKH2, Strings.UltimaWeaponKH2);
		GameRegistry.registerItem(UltimaWeaponBBS, Strings.UltimaWeaponBBS);
		GameRegistry.registerItem(UltimaWeaponDDD, Strings.UltimaWeaponDDD);
		GameRegistry.registerItem(Umbrella, Strings.Umbrella);
		GameRegistry.registerItem(Unbound, Strings.Unbound);
		GameRegistry.registerItem(UnicornisForetellersKeyblade, Strings.UnicornisForetellersKeyblade);
		GameRegistry.registerItem(UrsusForetellersKeyblade, Strings.UrsusForetellersKeyblade);
		GameRegistry.registerItem(VictoryLine, Strings.VictoryLine);
		GameRegistry.registerItem(VoidGear, Strings.VoidGear);
		GameRegistry.registerItem(VulpeusForetellersKeyblade, Strings.VulpeusForetellersKeyblade);
		GameRegistry.registerItem(WaytotheDawn, Strings.WaytotheDawn);
		GameRegistry.registerItem(WaywardWind, Strings.WaywardWind);
		GameRegistry.registerItem(WinnersProof, Strings.WinnersProof);
		GameRegistry.registerItem(WishingLamp, Strings.WishingLamp);
		GameRegistry.registerItem(WishingStar, Strings.WishingStar);
		GameRegistry.registerItem(WoodenKeyblade, Strings.WoodenKeyblade);
		GameRegistry.registerItem(WoodenStick, Strings.WoodenStick);
		GameRegistry.registerItem(YoungXehanortsKeyblade, Strings.YoungXehanortsKeyblade);
		GameRegistry.registerItem(ZeroOne, Strings.ZeroOne);
		
		//CHAINS
		GameRegistry.registerItem(Chain_AbaddonPlasma, Strings.Chain_AbaddonPlasma);
		
	}
	
	public static void registerRenders(){
		registerRender(AbaddonPlasma);
		registerRender(AbyssalTide);
		registerRender(AllforOne);
		registerRender(AnguisForetellersKeyblade);
		registerRender(AstralBlast);
		registerRender(Aubade);
		registerRender(BondofFlame);
		registerRender(Brightcrest);
		registerRender(ChaosRipper);
		registerRender(CircleofLife);
		registerRender(Counterpoint);
		registerRender(Counterpoint);
		registerRender(Crabclaw);
		registerRender(CrownofGuilt);
		registerRender(DarkerThanDark);
		registerRender(Darkgnaw);
		registerRender(DecisivePumpkin);
		registerRender(DestinysEmbrace);
		registerRender(DiamondDust);
		registerRender(Divewing);
		registerRender(DivineRose);
		registerRender(DreamSword);
		registerRender(DualDisc);
		registerRender(Earthshaker);
		registerRender(EndofPain);
		registerRender(EndsoftheEarth);
		registerRender(FairyHarp);
		registerRender(FairyStars);
		registerRender(FatalCrest);
		registerRender(Fenrir);
		registerRender(FerrisGear);
		registerRender(FollowtheWind);
		registerRender(FrolicFlame);
		registerRender(GlimpseofDarkness);
		registerRender(GuardianBell);
		registerRender(GuardianSoul);
		registerRender(GullWing);
		registerRender(HerosCrest);
		registerRender(HiddenDragon);
		registerRender(Hyperdrive);
		registerRender(IncompleteKiblade);
		registerRender(JungleKing);
		registerRender(KeybladeofPeoplesHearts);
		registerRender(Kiblade);
		registerRender(KingdomKey);
		registerRender(KingdomKeyD);
		registerRender(KnockoutPunch);
		registerRender(LadyLuck);
		registerRender(LeasKeyblade);
		registerRender(LeopardosForetellersKeyblade);
		registerRender(Leviathan);
		registerRender(Lionheart);
		registerRender(LostMemory);
		registerRender(LunarEclipse);
		registerRender(MarkofaHero);
		registerRender(MasterXehanortsKeyblade);
		registerRender(MastersDefender);
		registerRender(MaverickFlare);
		registerRender(MetalChocobo);
		registerRender(MidnightRoar);
		registerRender(MissingAche);
		registerRender(Monochrome);
		registerRender(MysteriousAbyss);
		registerRender(NoName);
		registerRender(Oathkeeper);
		registerRender(Oblivion);
		registerRender(OceanRage);
		registerRender(Olympia);
		registerRender(OmegaWeapon);
		registerRender(OminousBlight);
		registerRender(OneWingedAngel);
		registerRender(PainofSolitude);
		registerRender(PhotonDebugger);
		registerRender(PixiePetal);
		registerRender(Pumpkinhead);
		registerRender(Rainfell);
		registerRender(RejectionofFate);
		registerRender(RoyalRadiance);
		registerRender(RumblingRose);
		registerRender(SignofInnocence);
		registerRender(SilentDirge);
		registerRender(SkullNoise);
		registerRender(SleepingLion);
		registerRender(SoulEater);
		registerRender(Spellbinder);
		registerRender(StarSeeker);
		registerRender(Starlight);
		registerRender(Stormfall);
		registerRender(StrokeofMidnight);
		registerRender(SweetDreams);
		registerRender(SweetMemories);
		registerRender(Sweetstack);
		registerRender(ThreeWishes);
		registerRender(TotalEclipse);
		registerRender(TreasureTrove);
		registerRender(TrueLightsFlight);
		registerRender(TwilightBlaze);
		registerRender(TwoBecomeOne);
		registerRender(UltimaWeaponKH1);
		registerRender(UltimaWeaponKH2);
		registerRender(UltimaWeaponBBS);
		registerRender(UltimaWeaponDDD);
		registerRender(Umbrella);
		registerRender(Unbound);
		registerRender(UnicornisForetellersKeyblade);
		registerRender(UrsusForetellersKeyblade);
		registerRender(VictoryLine);
		registerRender(VoidGear);
		registerRender(VulpeusForetellersKeyblade);
		registerRender(WaytotheDawn);
		registerRender(WaywardWind);
		registerRender(WinnersProof);
		registerRender(WishingLamp);
		registerRender(WishingStar);
		registerRender(WoodenKeyblade);
		registerRender(WoodenStick);
		registerRender(YoungXehanortsKeyblade);
		registerRender(ZeroOne);
		
		//CHAINS
		registerRender(Chain_AbaddonPlasma);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
