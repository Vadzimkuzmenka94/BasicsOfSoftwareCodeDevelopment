
public class task3_7 {
    public static void main(String[] args) {
        int m = 12;
        int n = 25;
        int i;
        for (m = 12; m < n; m++) {
            for (i = 2; i < m; i++) {
                long z = m % i;
                if (z == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
