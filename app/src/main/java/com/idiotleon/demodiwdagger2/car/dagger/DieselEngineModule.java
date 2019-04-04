package com.idiotleon.demodiwdagger2.car.dagger;

import com.idiotleon.demodiwdagger2.car.DieselEngine;
import com.idiotleon.demodiwdagger2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}