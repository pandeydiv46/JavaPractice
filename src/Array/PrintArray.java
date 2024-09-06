package Array;

import java.util.Scanner;

public class PrintArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        String name[]=new String[size];
        for(int i=0;i<size;i++){
            name[i]= sc.next();
            System.out.println(name[i]);
        }

    }

}
