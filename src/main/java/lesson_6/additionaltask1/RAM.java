package lesson_6.additionaltask1;

public class RAM {
    public String name;
    public int volume;

    public RAM() {
        this.name = "Usual RAM";
        this.volume = 8;
    }
    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println("RAM: " + name + ", volume: " + volume + " GB");
    }
}