/**//*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
        дробную и целую части числа и вывести полученное значение числа.*/

public class task1_4 {
    public static void main(String[] args) {
        double a = 987.654;
        double b = (a * 1000) % 1000 + (int) a / 1000.0;
        System.out.println(b);


    }
}