
public class Main {
    public static void main(String[] args) {

        int clientAccount = 100; //начальный счёт
        int bonusX = 100; // бонус
        int amountDeposit = 1150; // сумма пополнения
        int totalBonus;

        if (amountDeposit > 1000) {
            totalBonus = amountDeposit / bonusX;
        } else {
            totalBonus = 0;
        }
        int totalDeposit = clientAccount + amountDeposit + totalBonus;

        System.out.println("Клиент пополнил счёт на " +
                amountDeposit + " рублей - бонус равен " +
                totalBonus + " рублям, итоговая сумма на счету клиента " +
                totalDeposit + " рублей.");
    }
}
