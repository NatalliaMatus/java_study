package lesson_8.task_2;

public class Main {
    public static void main(String[] args) {
        Position[] employees = createEmployees();
        printEmployees(employees);
    }

    private static Position[] createEmployees() {
        return new Position[]{
                new Director(),
                new Worker(),
                new Accountant()
        };
    }

    private static void printEmployees(Position[] employees) {
        for (Position p : employees) {
            p.printPosition();
        }
    }
}
