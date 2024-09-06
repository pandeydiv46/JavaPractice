import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int factorial=1;
        for(int i=a;i>=1;i--)
        {

            factorial=i*factorial;
        }
        System.out.println(factorial);


    }
}
