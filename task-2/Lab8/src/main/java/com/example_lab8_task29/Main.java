package com.example_lab8_task29;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 2023, 75);
        GasolineCar gasolineCar = new GasolineCar("Toyota", "Camry", 2023, 2.5);
        HybridCar hybridCar = new HybridCar("Toyota", "Prius", 2023, 1.8, 50);

        cars.add(electricCar);
        cars.add(gasolineCar);
        cars.add(hybridCar);

        cars.forEach((Consumer<? super Car>) car -> System.out.println(car));

        ElectricCar copyElectricCar = electricCar.copy();
        GasolineCar copyGasolineCar = gasolineCar.copy();
        HybridCar copyHybridCar = hybridCar.copy();

        System.out.println("Are an electric car and a copy of an electric car the same? " + electricCar.equals(copyElectricCar));
        System.out.println("Are a gasoline car and a copy of a gasoline car the same? " + gasolineCar.equals(copyGasolineCar));
        System.out.println("Are a hybrid car and a copy of a hybrid car the same? " + hybridCar.equals(copyHybridCar));
    }
}