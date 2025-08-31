package lesson_7.task_1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("Unknown", "Unknown");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String nameCaller){
        System.out.println("Сalling " + nameCaller);
    }

    public void receiveCall(String nameCaller, String numberCaller){
        System.out.println("Сalling " + nameCaller + ", number " + numberCaller);
    }

    public String getNumber(){
        return this.number;
    }

    public void sendMessage(String... numberOfPhone){
        for (String number :numberOfPhone){
            System.out.println("Number of phone " + number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

}
