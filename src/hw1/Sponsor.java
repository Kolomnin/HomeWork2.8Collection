package hw1;

public class Sponsor  {

    private static String nameSponsor;
    private static Integer moneyForDrive;

    public Sponsor(String nameSponsor, Integer moneyForDrive) {
        setNameSponsor(nameSponsor);
        setMoneyForDrive(moneyForDrive);
    }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public void setNameSponsor(String nameSponsor) {
        if (nameSponsor == null || nameSponsor.isBlank()) {
            Sponsor.nameSponsor = "Name no set";
        } else {
            Sponsor.nameSponsor = nameSponsor;
        }
    }

    public static Integer getMoneyForDrive() {
        return moneyForDrive;
    }

    public void setMoneyForDrive(Integer moneyForDrive) {
        if (moneyForDrive == null || moneyForDrive < 0) {
            Sponsor.moneyForDrive = 0;
        } else {
            Sponsor.moneyForDrive = moneyForDrive;
        }
    }

    public void sponsorship() {
        System.out.println("Для заезда. Спонсор: " + getNameSponsor() + " выделил " + getMoneyForDrive() + " рублей.");
    }

    @Override
    public String toString() {
        return nameSponsor + " сумма поддержки " + moneyForDrive + "руб.";
    }
}
