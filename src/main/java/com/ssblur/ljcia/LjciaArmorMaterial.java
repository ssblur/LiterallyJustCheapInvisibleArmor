package com.ssblur.ljcia;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class LjciaArmorMaterial implements ArmorMaterial {

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 8;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

    @Override
    public String getName() {
        return "invisible";
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }
    
}
