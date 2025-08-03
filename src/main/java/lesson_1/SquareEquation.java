/*
Захотела усложнить себе задачу и решила квадратное уравнение
 */
package lesson_1;

import java.util.Arrays;

public class SquareEquation {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 4;

        // вывожу дискриминант
        double[] result_square = calculateRoots(a, b, c);
        System.out.println("Корни: " + Arrays.toString(result_square));
    }

    //рассчитываю дискриминант
    public static int calculateDiscriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    //рассчитываю возможные корни
    public static double[] calculateRoots(int a, int b, int c) {
        int discriminant = calculateDiscriminant(a, b, c);
        System.out.println("Результат дискриминанта = " + discriminant);
        //учитываю кейс что на 0 нельзя делить и возвращаю пустой массив
        if (a == 0) {
            System.out.println("На ноль делить нельзя");
            return new double[0];
        }
        //если дискриминант больше нуля то нужно вернуть 2 корня
        else if (discriminant > 0) {
            double[] result = new double[2];
            result[0] = ((-b) + Math.sqrt(discriminant)) / (2 * a);
            result[1] = ((-b) - Math.sqrt(discriminant)) / (2 * a);
            return result;
        }
        //если дискриминант равен нулю то нужно вернуть 1 корень
        else if (discriminant == 0) {
            double[] result = new double[1];
            result[0] = ((double) (-b) / (2 * a));
            return result;
        }
        //если корней нету то должны вернуть пустой массив
        return new double[0];
    }
}
