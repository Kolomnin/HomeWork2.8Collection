package hw1.License;

import hw1.Car.Truck;
import hw1.Driver;

public class LicenseC extends Driver<Truck> {


    public LicenseC(String nameDriver, Double drivingExperience) {
        super(nameDriver, "C", drivingExperience);
    }

    @Override
    public void startMoving(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void endMoving(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }
}