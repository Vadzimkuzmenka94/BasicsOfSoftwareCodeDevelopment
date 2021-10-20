// это нужно сделать

public class task3_2 {
    public static void main(String[] args) {
        int a,b;
        double y,x,dx;

        a=0;
        b=5;
        dx=0.5;
        for (x=a;x<=b-dx;x+=dx )
        {
            System.out.print("x= " +x+",");
            if (x<0.5){
                y = Math.sqrt(x) *dx;
                System.out.println("y ="+y);
            }
            else if (x>=0){
                y =Math.exp(x);
                System.out.println("y ="+y);

            }
        }
    }
}