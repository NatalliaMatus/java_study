package lesson_6.additionaltask2;

public class ATM {
    private int count20;
    private int count50;
    private int count100;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addMoney(int add20, int add50, int add100) {
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }

    public boolean withdrawMoney(int amount) {
        System.out.println("Attempt to issue money " + amount);
        int need100 = Math.min(amount / 100, count100);
        amount -= need100 * 100;

        int need50 = Math.min(amount / 50, count50);
        amount -= need50 * 50;

        int need20 = Math.min(amount / 20, count20);
        amount -= need20 * 20;

        if (amount == 0) {
            count100 -= need100;
            count50 -= need50;
            count20 -= need20;

            System.out.println("Withdrawal: " +
                    need20 + " x banknote 20, " +
                    need50 + " x banknote 50, " +
                    need100 + " x banknote 100");
            return true;
        } else {
            return false;
        }
    }

    public void printStatus() {
        System.out.println("ATM contains: " +
                count20 + " x banknote 200, " +
                count50 + " x banknote 50, " +
                count100 + " x banknote 100");
    }
}
