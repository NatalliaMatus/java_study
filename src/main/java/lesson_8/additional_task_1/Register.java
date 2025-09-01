package lesson_8.additional_task_1;

public class Register {
    private final Document[] storage = new Document[10];
    private int size = 0;

    public void save(Document doc) {
        if (size >= storage.length) {
            System.out.println("The register is full, cannot be added: " + doc.getClass().getSimpleName());
            return;
        }
        storage[size++] = doc;
    }

    public void printInfo(Document doc) {
        System.out.println("Information about document:");
        doc.printInfo();
    }

    public void arraySize() {
        System.out.println("Size of array after adding array: " + size);
    }
}
