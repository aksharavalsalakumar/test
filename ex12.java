import java.util.Scanner;

public class ex12 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        float i = in.nextFloat();
        float j = in.nextFloat();
        float k = in.nextFloat();
        float x = in.nextFloat();
        float y = in.nextFloat();
        add(i,j,k,x,y);

    }
    public static void add(float a,float b,float c,float d,float e)
    {
        float sum=a+b+c+d+e;
        float avg=sum/5;
        System.out.println("sum is "+sum+" average is "+avg);

    }
}
