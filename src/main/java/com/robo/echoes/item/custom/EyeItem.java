package com.robo.echoes.item.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EyeItem extends Item {

    public EyeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            //output random number
            outputRandomNumber(player);
            player.getCooldowns().addCooldown(this, 10);
        }

        return super.use(level, player, hand);
    }

    private void outputRandomNumber(Player player) {
        int rdm = getRandomNumber() + 1;
        player.sendSystemMessage(Component.literal("Your number is " + rdm));
        if(rdm == 10) {
            MobEffectInstance regeneration = new MobEffectInstance(MobEffects.REGENERATION, 200, 1);
            player.addEffect(regeneration);
        }
        else if(rdm == 1) {
            MobEffectInstance poison = new MobEffectInstance(MobEffects.POISON, 100, 1);
            player.addEffect(poison);
        }
    }
    private int getRandomNumber() {
            return RandomSource.createNewThreadLocalInstance().nextInt(10);

    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {


        super.appendHoverText(stack, level, components, flag);
    }
}
