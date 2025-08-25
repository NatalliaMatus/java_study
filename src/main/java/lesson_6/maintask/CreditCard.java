package lesson_6.maintask;

public class CreditCard {
    public String accountNumber;
    public double currentAmountOnTheAccount;

    public CreditCard(String accountNumber, double currentAmountOnTheAccount) {
        this.accountNumber = accountNumber;
        this.currentAmountOnTheAccount = currentAmountOnTheAccount;
    }

    public void deposit(double accruedAmount) {
        currentAmountOnTheAccount += accruedAmount;
    }

    public void withdrawl(double reducedAmount) {
        if (reducedAmount <= currentAmountOnTheAccount) {
            currentAmountOnTheAccount -= reducedAmount;
        } else {
            System.out.println("Insufficient funds on account " + accountNumber);
        }
    }

    public String getFullData() {
        return "Card data:\n\t" +
                "Account number: " + accountNumber + "\n\t" +
                "Current amount on the account: " + currentAmountOnTheAccount + "\n\t";
    }
}
