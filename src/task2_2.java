public class task2_2 {
    public static void main(String[] args) {

        int a = 8;
        int b = 10;
        int c = 11;
        int d = 7;
        int maxab = Math.max(a,b);
        int maxcd = Math.max(c,d);
        int maxabcd = Math.max(maxab, maxcd);
        System.out.println(maxab);
        System.out.println(maxcd);
        System.out.println(maxabcd);

    }
}
