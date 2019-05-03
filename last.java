import java.util.InputMismatchException;
import java.util.S;

public class last {
    public static void main(String[] args) {
        double num1 = checkNumber();
        double num2 = checkNumber();
        if (num1 != -1 && num2 != -1) {
            double result;
            Character op = checkOperator();
            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/':
                    try {
                        result = num1 / num2;
                        System.out.println(result);
                    } catch (ArithmeticException e) {
                        System.err.println("division by zero");
                    }
            }
        }
    }

    public static double checkNumber() {

        boolean i = true;
        do {
            try {
                Scanner in = new Scanner(System.in);
                i = true;
                double num;
                System.out.println("enter number");
                num = in.nextDouble();
                return num;
            } catch (InputMismatchException m) {
                System.err.println("invalid condition..try again");
                i = false;
            }

        } while (i == false);
        return -1;
    }

    public static Character checkOperator() {
        boolean i = true;

        do {
            Scanner in = new Scanner(System.in);
            i = true;
            boolean p;
            Character op1;
            System.out.println("enter operator");
            op1 = in.next().charAt(0);
            String o = String.valueOf(op1);
            p = o.matches("[+/*-]");
            if (p) {
                return op1;
            } else {
                System.err.println("invalid operator");
            }

        } while (i == true);
        return 0;
    }
}

