package hw1;

public class Mechanic<T extends Transport>{
    private final String name;
    private final String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    // метод провести техобслуживание
    public boolean passDiagnostics(T type) {
        return type.passDiagnostics();
    }

    public void repair(T type) {

    }

    @Override
    public String toString() {
        return name + surname + " из компании " + company;
    }
}
