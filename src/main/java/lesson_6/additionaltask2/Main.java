package lesson_6.additionaltask2;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(10, 10, 10);
        atm.printStatus();

        atm.addMoney(5, 0, 2);
        atm.printStatus();

        System.out.println("Success? " + atm.withdrawMoney(370));
        atm.printStatus();

        System.out.println("Success? " + atm.withdrawMoney(125));
        atm.printStatus();
    }
}
