package exohr.drinksplus.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent VODKA = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 1f).build();
}
