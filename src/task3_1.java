import java.util.Scanner;

/*1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        все числа от 1 до введенного пользователем числа.*/

public class task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scanner.nextInt();
        int sum = 0;
        int x;
        if (i > 0)
            for (x = 1; x <= i; x++) {
                sum = sum + x;
                System.out.println(sum);
            }
        else {
            System.out.println("число не положительное");
        }
    }
}