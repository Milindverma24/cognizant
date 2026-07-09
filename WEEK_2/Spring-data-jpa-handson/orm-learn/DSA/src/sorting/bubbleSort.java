package sorting;

import java.util.Scanner;

public class bubbleSort {
    public void sorted(int[] arr){
        int length = arr.length;
        for (int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp =arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Number of input : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter No. : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(" , "+arr[i]);
        }
        System.out.println();
        bubbleSort obj = new bubbleSort();
        obj.sorted(arr);
        System.out.println("Sorted Array : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" , ");
        }
        sc.close();
    }
}
