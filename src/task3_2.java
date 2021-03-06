import java.util.InputMismatchException;
import java.util.Scanner;

/*
Вычисляет значение функции на отрезке [a,b] c шагом h:
    x, x>2
    -x, x<=2
 */

public class task3_2 {
    public static void calculate(double a, double b, double h) {
        double x = a;
        double y;

        System.out.println(String.format("%7s %7s", "x", "y"));
        while (x <= b) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }

            System.out.println(String.format("%7s %7s", Double.toString(x), Double.toString(y)));
            x += h;
        }
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите промежуток, на котором будут высчитаны значения функции ([a,b]):");
            double a = in.nextDouble();
            double b = in.nextDouble();

            System.out.println("Введите шаг:");
            int h = in.nextInt();

            calculate(a, b, h);

        } catch (InputMismatchException ex) {
            System.out.println("Ошибка ввода! " + ex.getMessage());
        }
    }
}