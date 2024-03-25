//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int check = 100; // текущий счет
        int replenishment = 1100; // сумма пополнения

        int bonus = replenishment / 100; // бонусы
        int sum = check + replenishment; // итоговый счет при пополнении менее 1000 руб.
        int sumBonus = sum + bonus; // итоговый счет при пополнении более 1000 руб.


        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (replenishment > 1000) {
            System.out.println("Ваш счет равен " + sumBonus + " руб. Начислено " + bonus + " бонусных рублей.");
        } else {
            System.out.println("Ваш счет равен " + sum + " руб. Начислено 0 бонусных рублей.");
        }
    }
}