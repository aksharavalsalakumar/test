import java.util.Scanner;

public class ex18 {
        public static void main(String []args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter no of rows");
            int l = in.nextInt();
            pattern(l);
        }
        public static void pattern(int l){
            int i,j,k=1;
            for(i=1;i<=l;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }
}
