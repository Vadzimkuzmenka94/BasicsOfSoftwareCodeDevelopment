/*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:*/

public class task1_6 {
    public static void main(String[] args) {
        int x = 0;
        int y = 4;
        if (x <4 && x > -4 & y < 4 && y > -3)
            if (x == -3 && x == -4 && x == 3 && x == 4 & y < 0)
                System.out.println(true);
            else {
                System.out.println(false);
            }
    }
}