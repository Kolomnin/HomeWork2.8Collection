package hw1;

import hw1.Car.Bus;
import hw1.Car.Car;
import hw1.Car.Truck;
import hw1.License.LicenseB;
import hw1.License.LicenseC;
import hw1.License.LicenseD;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sponsor sponsor1 = new Sponsor("CarDrive", 150_000);
        Sponsor sponsor2 = new Sponsor("Monster", 100_000);
        Sponsor sponsor3 = new Sponsor("Formula", 170_000);

        Mechanic mechanic1 = new Mechanic<Car>("Andrey", "Andreev", "Motor");
        Mechanic mechanic2 = new Mechanic<Truck>("Vitia", "Viktorov", "CarFIX");
        Mechanic mechanic3 = new Mechanic<Bus>("Ivan", "Ivanov", "Mischlen");



        Bus bus1 = new Bus("Паз", "т34-100", 2.5);
        System.out.println(bus1);
        bus1.startMoving();
        bus1.pitStop();
        bus1.bestLapTime();
        bus1.maxSpeed();
        bus1.endMoving();
        bus1.addDriver(new LicenseD("Pasha", 4.0));
        bus1.addMechanic(mechanic3);
        bus1.addSponsor(sponsor2);
        System.out.println();

        Bus bus2 = new Bus("Man", "Voyager", 6.2);
        System.out.println(bus2);
        bus2.startMoving();
        bus2.pitStop();
        bus2.bestLapTime();
        bus2.maxSpeed();
        bus2.endMoving();
        System.out.println();

        Bus bus3 = new Bus("Volkswagen", "Transporter", 5.5);
        System.out.println(bus3);
        bus3.startMoving();
        bus3.pitStop();
        bus3.bestLapTime();
        bus3.maxSpeed();
        bus3.endMoving();
        System.out.println();

        Bus bus4 = new Bus("Ford", "Transit", 4.5);
        System.out.println(bus4);
        bus4.startMoving();
        bus4.pitStop();
        bus4.bestLapTime();
        bus4.maxSpeed();
        bus4.endMoving();
        System.out.println();

        Car car1 = new Car("Lada", "Niva", 1.6);
        System.out.println(car1);
        car1.startMoving();
        car1.pitStop();
        car1.bestLapTime();
        car1.maxSpeed();
        car1.endMoving();
        car1.addDriver(new LicenseB("Ivan", 10.0));
        car1.addMechanic(mechanic1);
        car1.addSponsor(sponsor2);
        System.out.println();


        Car car2 = new Car("Lada", "Vesta", 1.6);
        System.out.println(car2);
        car2.startMoving();
        car2.pitStop();
        car2.bestLapTime();
        car2.maxSpeed();
        car2.endMoving();
        System.out.println();

        Car car3 = new Car("Volvo", "s60", 2.4);
        System.out.println(car3);
        car3.startMoving();
        car3.pitStop();
        car3.bestLapTime();
        car3.maxSpeed();
        car3.endMoving();
        System.out.println();

        Car car4 = new Car("Volkswagen", "Jetta", 1.8);
        System.out.println(car4);
        car4.startMoving();
        car4.pitStop();
        car4.bestLapTime();
        car4.maxSpeed();
        car4.endMoving();
        System.out.println();

        Truck truck1 = new Truck("Scania", "VF-100", 12.0);
        System.out.println(truck1);
        truck1.startMoving();
        truck1.pitStop();
        truck1.bestLapTime();
        truck1.maxSpeed();
        truck1.endMoving();
        truck1.addDriver(new LicenseC("Pasha", 4.0));
        truck1.addMechanic(mechanic2);
        truck1.addSponsor(sponsor3, sponsor1);
        System.out.println();

        Truck truck2 = new Truck("Kamaz", "KZ10", 10.0);
        System.out.println(truck2);
        truck2.startMoving();
        truck2.pitStop();
        truck2.bestLapTime();
        truck2.maxSpeed();
        truck2.endMoving();
        System.out.println();

        Truck truck3 = new Truck("MAN", "JetFly", 11.0);
        System.out.println(truck3);
        truck3.startMoving();
        truck3.pitStop();
        truck3.bestLapTime();
        truck3.maxSpeed();
        truck3.endMoving();
        System.out.println();

        Truck truck4 = new Truck("Dodge", "Ram", 6.0);
        System.out.println(truck4);
        truck4.startMoving();
        truck4.pitStop();
        truck4.bestLapTime();
        truck4.maxSpeed();
        truck4.endMoving();
        System.out.println();

        Driver<Car> ivan = new LicenseB("Ivan", 5.0);
        System.out.println(ivan);
        ivan.startMoving(car4);
        ivan.refuel(car4);
        ivan.endMoving(car4);
        System.out.println();

        LicenseD pasha = new LicenseD("Pasha", 4.0);
        System.out.println(pasha);
        pasha.startMoving(bus1);
        pasha.refuel(bus1);
        pasha.endMoving(bus1);
        System.out.println();

        Driver<Truck> vitia = new LicenseC("Vitia", 10.0);
        System.out.println(vitia);
        vitia.startMoving(truck3);
        vitia.refuel(truck3);
        vitia.endMoving(truck3);
        System.out.println();

        List<Transport> transports = List.of(car1, truck1, bus1);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car1);
        serviceStation.addTruck(truck1);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printTransport(transport);
        }
    }

    private static void printTransport(Transport transport) {
        System.out.println("Информация по автомобилю: " + transport.getBrand() + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());

        System.out.println();
    }
}