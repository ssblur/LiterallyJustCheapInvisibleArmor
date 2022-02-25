package com.ssblur.ljcia;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LjciaMod implements ModInitializer {
	public static final String MODID = "ljcia";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static ArmorMaterial MATERIAL = new LjciaArmorMaterial();

	public static final Item INVISIBLE_HELMET = Registry.register(
		Registry.ITEM, 
		new Identifier(MODID, "helmet"), 
		new ArmorItem(MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.MISC)));

	public static final Item INVISIBLE_CHEST = Registry.register(
		Registry.ITEM, 
		new Identifier(MODID, "chest"), 
		new ArmorItem(MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.MISC)));

	public static final Item INVISIBLE_LEGS = Registry.register(
		Registry.ITEM, 
		new Identifier(MODID, "legs"), 
		new ArmorItem(MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.MISC)));

	public static final Item INVISIBLE_FEET = Registry.register(
		Registry.ITEM, 
		new Identifier(MODID, "feet"), 
		new ArmorItem(MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.MISC)));

	@Override
	public void onInitialize() {}
}
