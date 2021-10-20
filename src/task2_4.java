public class task2_4 {
    public static void main(String[] args) {
        int x=100; // сторона кирпича
        int y=2; // сторона кирпича 2
        int z= 32; // сторона кирпича 3

        int a=25; // сторона отверстия
        int b = 10; // сторона отверстия 2

        if (x <=a && y <=b || y <=a && x <=b || x <=a && z<=b || z<=a && x<=b || z <=a && y <=b || y <= a && z <=b )
            System.out.println("проходит");

        else {
            System.out.println("не пройдет");
        }
    }
}