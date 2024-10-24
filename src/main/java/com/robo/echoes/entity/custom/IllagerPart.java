package com.robo.echoes.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.entity.PartEntity;

public class IllagerPart extends PartEntity<IllagerEntity> {

    public final IllagerEntity parentIllager; // Renommé pour la clarté
    public final String name;
    private final EntityDimensions size;

    public IllagerPart(IllagerEntity parentIllager, String name, float width, float height) {
        super(parentIllager);
        this.size = EntityDimensions.scalable(width, height);
        this.refreshDimensions();
        this.parentIllager = parentIllager;
        this.name = name;
    }

    protected void defineSynchedData() {
    }

    protected void readAdditionalSaveData(CompoundTag p_31025_) {
    }

    protected void addAdditionalSaveData(CompoundTag p_31028_) {
    }

    public boolean isPickable() {
        return true;
    }

    public boolean hurt(DamageSource damageSource, float damageAmount) {
        return !this.isInvulnerableTo(damageSource) && this.parentIllager.hurt(damageSource, damageAmount);
    }

    public boolean is(Entity entity) {
        return this == entity || this.parentIllager  == entity;
    }

    public Packet<?> getAddEntityPacket() {
        throw new UnsupportedOperationException();
    }

    public EntityDimensions getDimensions(Pose pose) {
        return this.size;
    }

    public boolean shouldBeSaved() {
        return false;
    }
}
