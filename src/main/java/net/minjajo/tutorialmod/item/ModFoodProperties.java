package net.minjajo.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MANGO = new FoodProperties.Builder().nutrition(3).saturationModifier(.25f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200), 0.95f).build();

}
