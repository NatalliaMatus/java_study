/*
Сделана игра для входа в клуб, во входных данных-возраст посетителя и количество денег
и в зависимости от входных парамертов определяется пускать или нет посетителя в клуб
 */

package lesson_1;

public class AgeGate {

    public static void main(String[] args) {
        int age = 16;                // возраст посетителя клуба
        float money = 522.75f;      // сколько денег

        System.out.println("Возраст: " + age);
        System.out.println("Деньги в кармане: " + money);

        // округляем деньги до целого числа
        int roundedMoney = (int) money;

        // логика пропуска в клуб
        boolean isAllowedStandard = age >= 18 && roundedMoney >= 500;
        boolean isAllowedVip = age < 18 && roundedMoney >= 1000;

        if (isAllowedStandard) {
            System.out.println("Пропуск по возрасту");
        } else if (isAllowedVip) {
            System.out.println("Пропуск по VIP-доступу");
        } else {
            System.out.println("Условия не выполнены");
        }

        // это показывает просто приоритет операций, я не придумала как прикрутить к игре
        boolean tricky = age + 2 * 5 > 25 || roundedMoney / 2 > 300;
        System.out.println("Тест приоритета операций: " + tricky);

    }
}
