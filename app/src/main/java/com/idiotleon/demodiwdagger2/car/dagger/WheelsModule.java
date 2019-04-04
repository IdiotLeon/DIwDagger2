package com.idiotleon.demodiwdagger2.car.dagger;

import com.idiotleon.demodiwdagger2.car.Rims;
import com.idiotleon.demodiwdagger2.car.Tires;
import com.idiotleon.demodiwdagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return new Tires();
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}