import java.util.Scanner;

public class Cal {
    public static void main(String[] args){
        System.out.println("calculator of no.");
        int op=1;
        Calculator(op);
    }
    static int Calculator(int operator) {
        int a;
        int b;

        Scanner sc=new Scanner(System.in);
        System.out.println("Decide the operator no.");
        operator= sc.nextInt();
        System.out.println("Take input Numbers");
        a=sc.nextInt();
        b=sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Sub="+(a-b));
                break;
            case 2:
                System.out.println("Mul="+(a*b));
                break;
            case 4:
                System.out.println("Add="+(a+b));
                break;
            case 3:
                System.out.println("Div="+(a/b));
            {

                if (a / b == 0) {
                    System.out.println("No is even");
                } else
                    System.out.println("no is odd");
            }
                break;
            default:
                System.out.println("Invalid No is given");

        }return operator;

    }
}
