package Array;

import java.util.Scanner;

public class array2D {
    public static void main(String args[])
    {
        int cols;
        int rows;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        cols=sc.nextInt();
        int x= sc.nextInt();//(X is a no for traversing)
        int[][] number=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                System.out.println("row no."+i+" "+"col no."+j);
            }
        }for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
                System.out.println("Value found at row no."+i+" & "+"col no."+j+" is: "+number[i][j]);
                System.out.println(number[i][j]);
                if(x==number[i][j]){
                    System.out.println("Value of X found at row no."+i+" & "+"col no."+j);

                }
                else System.out.println("'X' not found");
            }
    }
    }
}
