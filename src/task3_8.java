import java.util.ArrayList;


public class task3_8 {
    public static void main(String[] args) {
        int a = 245;
        int b = 458;
        System.out.println("Цифры которые входят в число a: " + numberEnter(a));
        System.out.println("Цифры которые входят в число b: " + numberEnter(b));
    }
    public static ArrayList numberEnter(int a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(a > 0){
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        for (int x : array) {
            System.out.println(x);
        }

        return array;
    }
}