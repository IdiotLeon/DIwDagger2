package com.idiotleon.demodiwdagger2.car.dagger;

import com.idiotleon.demodiwdagger2.car.Engine;
import com.idiotleon.demodiwdagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}