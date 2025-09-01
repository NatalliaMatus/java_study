package lesson_8.additional_task_1;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        SupplyContract sc = new SupplyContract(
                "1", Instant.now().minus(1, ChronoUnit.DAYS), "TestSupplyContract", 150);

        EmployeeContract ec = new EmployeeContract(
                "2", Instant.now().minus(3, ChronoUnit.DAYS), Instant.now().minus(2, ChronoUnit.DAYS), "Ivan Ivanov");

        FinancialInvoice fi = new FinancialInvoice(
                "3", Instant.now().minus(4, ChronoUnit.DAYS), 1.23, 42);

        register.save(sc);
        register.save(ec);
        register.save(fi);

        register.printInfo(ec);
        register.arraySize();
    }
}

