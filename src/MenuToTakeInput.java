import java.util.Scanner;

public class MenuToTakeInput {
    public static void main(String[] args){


        int inputNo;
        Scanner sc=new Scanner(System.in);

                do {
                    System.out.println("Enter Marks");
                    int Marks= sc.nextInt();
                    if (Marks >=90){
                        System.out.println("This is Good");
                    }else if(89>= Marks && Marks>= 60){
                        System.out.println("This is also Good");
                    }else
                        System.out.println("This is good as well");
                    System.out.println("Enter 0 or 1");
                    inputNo= sc.nextInt();

                }while (inputNo==1);
        }



    }

