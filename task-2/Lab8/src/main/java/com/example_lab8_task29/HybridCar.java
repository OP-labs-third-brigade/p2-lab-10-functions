package com.example_lab8_task29;

public class HybridCar extends Car implements Immutable {
    private final double engineCapacity;
    private final int batteryCapacity;

    public HybridCar(String brand, String model, int year, double engineCapacity, int batteryCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.batteryCapacity = batteryCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public HybridCar copy() {
        double newEngineCapacity = this.getEngineCapacity() + 0.5;
        int newBatteryCapacity = this.getBatteryCapacity() + 10;
        return new HybridCar(getBrand(), getModel(), getYear(), newEngineCapacity, newBatteryCapacity);
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", engineCapacity=" + engineCapacity +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}