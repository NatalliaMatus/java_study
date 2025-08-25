package lesson_6.additionaltask1;

public class HDD {
    public String name;
    public int volume;
    public String type;

    public HDD() {
        this.name = "Usual HDD";
        this.volume = 256;
        this.type = "inner";
    }
    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("HDD: " + name + ", volume: " + volume + " GB, type: " + type);
    }
}
