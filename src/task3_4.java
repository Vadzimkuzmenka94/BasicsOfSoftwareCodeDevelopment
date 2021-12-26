import java.math.BigInteger;
/*4. Составить программу нахождения произведения квадратов первых двухсот чисел.*/
public class task3_4 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }
}