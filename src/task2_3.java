public class task2_3 {
    public static void main(String[] args) {

        int x1 = 9;
        int y1 = 12;
        int x2 = 10;
        int y2 = 4;
        int x3 = 10;
        int y3 = 2;
        if((x1-x3) * (y2-y3) - (x2-x3) * (y1-y3) == 0)
            System.out.println("Лежат в одной прямой");
        else {
            System.out.println("не лежат в одной прямой");
        }
    }
}