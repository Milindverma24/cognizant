package sorting;

import java.util.Scanner;

class selectionSort{
    public void sorted(int[] arr){
        int length = arr.length;
        for (int i=0;i<length-1;i++){
            int min_arr= i;
            for (int j=i+1;j<length;j++){
                if(arr[min_arr]>arr[j]){
                    min_arr=j;
                }
            }
            int temp=arr[min_arr];
            arr[min_arr]=arr[i];
            arr[i]=temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i =0; i<n;i++){
            System.out.print("array inputs");
            arr[i]=sc.nextInt();
        }
        System.out.println("unsorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        selectionSort obj = new selectionSort();
        obj.sorted(arr);
        System.out.print("sorted array");
        for (int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}