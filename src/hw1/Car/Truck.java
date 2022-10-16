package hw1.Car;

import hw1.Transport;
import hw1.Сompeting;

import java.time.LocalDate;

public class Truck extends Transport implements Сompeting {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() { System.out.println("Грузовик начал движение"); }

    @Override
    public void endMoving() { System.out.println("Грузовик остановился"); }

    @Override
    public boolean passDiagnostics() {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Устанавливаем на ТС " + getBrand() + " " + getModel() + " зимнюю резину. Время года - зима, срочно пройти диагностику ТС \n");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Устанавливаем на ТС " + getBrand() + " " + getModel() + " зимнюю резину. Время года - весна, диагностику ТС проходить не нужно \n");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Устанавливаем на ТС " + getBrand() + " " + getModel() + " летнюю резину. Время года - лето, срочно пройти диагностику ТС \n");
        } else {
            System.out.println("Устанавливаем на ТС " + getBrand() + " " + getModel() + " летнюю резину. Время года - осень, диагностику ТС проходить не нужно \n");
        }
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Грузовой автомобиль: " + getBrand() + " " + getModel() + " отремонтирован.");
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 30 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 3 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 150 км/ч");
    }

    @Override
    public String toString() {
        return "Грузовик: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

}
