package com.idiotleon.demodiwdagger2.car.dagger;

import com.idiotleon.demodiwdagger2.MainActivity;
import com.idiotleon.demodiwdagger2.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    // For constructor injection
    Car getCar();

    // For field injection
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
