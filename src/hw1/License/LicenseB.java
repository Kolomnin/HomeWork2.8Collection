package hw1.License;

import hw1.Car.Car;
import hw1.Driver;

public class LicenseB extends Driver<Car> {

    public LicenseB(String nameDriver, Double drivingExperience) {
        super(nameDriver, "B", drivingExperience);
    }

    @Override
    public void startMoving(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на легковом автомобиле "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void endMoving(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на легковом автомобиле " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил легковой автомобиль " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }
}
