import java.util.Scanner;

public class PrintEvenNo {
    public static void main(String[] args){
      EvenNo();

    }
    static void EvenNo()
    {
        int i;
        System.out.println("Enter the No.");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
            if(i%2==0)
            {
                System.out.println("Entered No is even");
            }else
                System.out.println("No is odd");
        }
    }


