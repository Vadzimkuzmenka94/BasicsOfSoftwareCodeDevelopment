/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
        𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
        ∗ 𝑡𝑔 𝑥y*/

public class task1_3 {
    public static void main(String[] args) {
        double x = 5;
        double y = 3;

        float c = (float) ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        System.out.println("при x =" + x + ", " + "y =" + y + ", " + "результат выражения равен " + c);


    }
}