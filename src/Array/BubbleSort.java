package Array;

public class BubbleSort {
    public static void main(String[] args){
        int arr[]={3,2,8,6,4};
        for(int i=0;i< arr.length-1-i;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;



            }
        }
        System.out.print(arr);
    }
}
