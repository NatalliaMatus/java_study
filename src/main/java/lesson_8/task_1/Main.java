package lesson_8.task_1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = createFigures();
        calculateTotalPerimeter(figures);
    }

    private static Figure[] createFigures() {
        return new Figure[]{
                new Triangle(3, 4, 5),
                new Rectangle(4, 6),
                new Circle(3),
                new Rectangle(2, 7),
                new Circle(5)
        };
    }

    private static void calculateTotalPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure f : figures) {
            sum += f.perimeter();
        }
        System.out.println("Sum of the perimeters of all figures: " + sum);
    }
}

