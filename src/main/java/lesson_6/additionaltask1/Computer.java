package lesson_6.additionaltask1;

public class Computer {
    public int cost;
    public String model;
    public RAM ram;
    public HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }
    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void printInfo() {
        System.out.println("Computer: model " + model + ", cost: " + cost + " USD");
        ram.printInfo();
        hdd.printInfo();
    }
}
