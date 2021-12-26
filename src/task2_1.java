/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
        он прямоугольным*/

public class task2_1 {
    public static void main(String[] args) {
        int a = 45;
        int b = 80;
        int c = 180 - (a + b);
        if (c > 0 )
            System.out.println("треугольник существует");
        else {
            System.out.println("прямоугольник не существует");
        }
        if (a+b==90 | (a ==90 | b ==90) )
            System.out.println("треугольник прямоугольный");
        else {
            System.out.println("треугольник не прямоугольный");
        }

    }
}
