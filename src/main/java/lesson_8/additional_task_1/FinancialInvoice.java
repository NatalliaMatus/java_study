package lesson_8.additional_task_1;

import java.time.Instant;
import java.util.Date;

public class FinancialInvoice extends Document {
    private double totalPerMonth;
    private int departmentCode;

    public FinancialInvoice() {}

    public FinancialInvoice(String number, Instant docDate, double totalPerMonth, int departmentCode) {
        super(number, docDate);
        this.totalPerMonth = totalPerMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void printInfo() {
        System.out.println("Financial invoice {" +
                "№=" + getNumber() +
                ", start date=" + getDocDate() +
                ", total for the month=" + totalPerMonth +
                ", department=" + departmentCode +
                '}');
    }
}
