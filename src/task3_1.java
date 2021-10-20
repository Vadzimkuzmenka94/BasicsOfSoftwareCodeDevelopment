import java.util.Scanner;

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