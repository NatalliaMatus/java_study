/*
Тут делаю управляющие конструкции
 */

package lesson_3;

public class ControlStructures {
    public static void main(String[] args) {
        System.out.println("Task1: " + displayTheSeasonFirstOption(9));//task1
        System.out.println("Task2: " + displayTheSeasonSecondOption(9));//task2
        System.out.println("Task3: " + checkForEven(0));//task3
        System.out.println("Task4: " + getWeather(-5));//task4
        System.out.println("Task5: " + getRainbowColor(1));//task5
    }

    //task1
    public static String displayTheSeasonFirstOption(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Mounth is not correct";
        };
    }

    //task2
    public static String displayTheSeasonSecondOption(int month) {
        if (month < 1 || month > 12) {
            return "Mounth is not correct";
        } else if (month == 12 || month == 1 || month == 2) {
            return "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            return "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            return "Summer";
        } else {
            return "Autumn";
        }
    }

    //task3
    public static String checkForEven(int verifiableNumber) {
        return (verifiableNumber % 2 == 0) ? "Even" : "Odd";
    }

    //task4
    public static String getWeather(int temperature) {
        if (temperature > -5) {
            return "Warm";
        } else if (temperature <= -5 && temperature > -20) {
            return "Fine";
        } else {
            return "Cold";
        }
    }

    //task5
    public static String getRainbowColor(int numberOfColor) {
        return switch (numberOfColor) {
            case 1 -> "Red";
            case 2 -> "Orange";
            case 3 -> "Yellow";
            case 4 -> "Green";
            case 5 -> "Light Blue";
            case 6 -> "Blue";
            case 7 -> "Violet";
            default -> "Wrong color number";
        };
    }
}
