package lesson_6.maintask;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1:");
        CreditCard creditCard1 = new CreditCard("0000", 10.5);
        CreditCard creditCard2 = new CreditCard("1111", 20.5);
        CreditCard creditCard3 = new CreditCard("2222", 30.5);

        printAllCardsData(creditCard1, creditCard2, creditCard3);

        System.out.println("-".repeat(50));

        creditCard1.deposit(10.3);
        creditCard2.deposit(20.3);
        creditCard3.withdrawl(40.3);

        printAllCardsData(creditCard1, creditCard2, creditCard3);
    }

    public static void printAllCardsData(CreditCard... cards) {
        System.out.println("Current status of cards: ");
        for (CreditCard card : cards) {
            System.out.println(card.getFullData());
        }
    }
}
