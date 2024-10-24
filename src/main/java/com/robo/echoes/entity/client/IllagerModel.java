package com.robo.echoes.entity.client;

import com.robo.echoes.Echoes;
import com.robo.echoes.entity.custom.IllagerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IllagerModel extends AnimatedGeoModel<IllagerEntity> {

    @Override
    public ResourceLocation getModelResource(IllagerEntity object) {
        return new ResourceLocation(Echoes.MOD_ID, "geo/geometry.illager.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IllagerEntity object) {
        return new ResourceLocation(Echoes.MOD_ID, "textures/entity/illager.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IllagerEntity animatable) {
        return new ResourceLocation(Echoes.MOD_ID, "animations/geometry.illager.animation.json");
    }


}
