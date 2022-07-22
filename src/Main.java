public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int startingScore = 100;
        int replenishmentAmount = 600;
        int accountAmount = startingScore + replenishmentAmount;
        int bonuses = (replenishmentAmount + startingScore) / 100;
        int totalAccountBalance = accountAmount + bonuses;
        if (replenishmentAmount >= 1000) {
            System.out.println("Начальный баланс = " + startingScore + " руб");
            System.out.println("Сумма пополнения = " + replenishmentAmount + " руб");
            System.out.println("Начислены бонусные рубли (1 бонусный рубль на каждые 100 р), итого баланс равен: " + totalAccountBalance + " руб");
        } else {
            System.out.println("Начальный баланс = " + startingScore + " руб");
            System.out.println("Сумма пополнения = " + replenishmentAmount + " руб");
            System.out.println("Бонусные рубли не начислены! Не выполнены условия по акции, счет пополнен на сумму менее чем на 1000 руб");
        }
    }
}
