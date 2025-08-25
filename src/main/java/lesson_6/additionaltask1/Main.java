package lesson_6.additionaltask1;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(500, "Asus X550");
        computer1.printInfo();

        System.out.println("-".repeat(40));

        RAM ram = new RAM("Kingston", 16);
        HDD hdd = new HDD("Seagate", 1024, "external");
        Computer comp2 = new Computer(1200, "Lenovo Legion", ram, hdd);
        comp2.printInfo();
    }
}
