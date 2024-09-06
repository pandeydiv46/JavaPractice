import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){
        int a = 0;
       prime(a);
    }
    public static void prime(int a)
    {
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        int n= sc.nextInt();
            if (a%n==0){
                System.out.println("No. is not a prime no.");
            }
            else
                System.out.println("No. is a prime no.");
        }

    }

