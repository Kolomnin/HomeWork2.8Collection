package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport implements Сompeting {
    private final String brand;
    private final String model;
    private Double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, Double engineVolume) {

        if (isNullOfEmpty(brand)) {
            this.brand = "no information";
        } else {
            this.brand = brand;
        }

        if (isNullOfEmpty(model)) {
            this.model = "no information";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract boolean passDiagnostics();
    public abstract void repair();

    public static boolean isNullOfEmpty(String value) {
        return value == null || value.isBlank();
    }

}
