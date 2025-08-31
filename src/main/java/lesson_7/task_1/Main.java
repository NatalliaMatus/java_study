package lesson_7.task_1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+995111111111", "Sony", 0.3);
        Phone phone2 = new Phone("+995222222222", "Nokia");
        Phone phone3 = new Phone();

        System.out.println("-".repeat(50));
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println("-".repeat(50));
        phone1.receiveCall("Alex");
        phone2.receiveCall("Hanna");
        phone3.receiveCall("Alena");
        phone3.receiveCall("Nina", "+995444444444");

        System.out.println("-".repeat(50));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
