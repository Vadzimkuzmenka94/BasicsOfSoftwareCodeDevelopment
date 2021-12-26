//3. Найти сумму квадратов первых ста чисел
public class task3_3 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            sum = (sum + (n * n));
            n++;
        }
        System.out.println(sum);
    }
}