package com.idiotleon.demodiwdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.idiotleon.demodiwdagger2.car.Car;
import com.idiotleon.demodiwdagger2.car.CarComponent;
import com.idiotleon.demodiwdagger2.car.DaggerCarComponent;
import com.idiotleon.demodiwdagger2.car.Engine;
import com.idiotleon.demodiwdagger2.car.Wheels;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
        car.drive();
    }
}
