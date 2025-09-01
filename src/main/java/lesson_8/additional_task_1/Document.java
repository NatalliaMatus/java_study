package lesson_8.additional_task_1;

import java.time.Instant;

public abstract class Document implements Printable {
    private String number;
    private Instant docDate;

    public Document() {
    }

    public Document(String number, Instant docDate) {
        this.number = number;
        this.docDate = docDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Instant getDocDate() {
        return docDate;
    }
}