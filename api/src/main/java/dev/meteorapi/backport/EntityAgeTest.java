/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package dev.meteorapi.backport;

import com.google.common.base.Predicates;
import net.minecraft.entity.LivingEntity;


import java.util.function.Predicate;


public enum EntityAgeTest implements Predicate<LivingEntity> {
    Baby,
    Adult,
    Both,
    ;

    @Override
    public boolean test(LivingEntity livingEntity) {
        return switch (this) {
            case Baby -> livingEntity.isBaby();
            case Adult -> !livingEntity.isBaby();
            case Both -> true;
        };
    }

    @Override
    public Predicate<LivingEntity> negate() {
        return switch (this) {
            case Baby -> Adult;
            case Adult -> Baby;
            case Both -> Predicates.alwaysFalse();
        };
    }

}
