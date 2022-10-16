package hw1.License;

import hw1.Car.Bus;
import hw1.Driver;

public class LicenseD extends Driver<Bus> {
    public LicenseD(String nameDriver, Double drivingExperience) {
        super(nameDriver, "D", drivingExperience);
    }


    @Override
    public void startMoving(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }


    @Override
    public void endMoving(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


}
