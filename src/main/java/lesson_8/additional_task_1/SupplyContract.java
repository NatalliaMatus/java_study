package lesson_8.additional_task_1;

import java.time.Instant;
import java.util.Date;

public class SupplyContract extends Document {
    private String goodsType;
    private int goodsCount;

    public SupplyContract() {
    }

    public SupplyContract(String number, Instant docDate, String goodsType, int goodsCount) {
        super(number, docDate);
        this.goodsType = goodsType;
        this.goodsCount = goodsCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Contract for the supply of goods {" +
                "№=" + getNumber() +
                ", start date=" + getDocDate() +
                ", type of goods='" + goodsType + '\'' +
                ", quantity=" + goodsCount +
                '}');
    }
}
