package lesson_8.additional_task_1;

import java.time.Instant;

public class EmployeeContract extends Document {
    private Instant endDate;
    private String employeeName;

    public EmployeeContract() {}

    public EmployeeContract(String number, Instant startDate, Instant endDate, String employeeName) {
        super(number, startDate);
        this.endDate = endDate;
        this.employeeName = employeeName;
    }

    @Override
    public void printInfo() {
        System.out.println("Contract with an employee {" +
                "№=" + getNumber() +
                ", start date=" + getDocDate() +
                ", end date=" + endDate +
                ", employee='" + employeeName + '\'' +
                '}');
    }
}
