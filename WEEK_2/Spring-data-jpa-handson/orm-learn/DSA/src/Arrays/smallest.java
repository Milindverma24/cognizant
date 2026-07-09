package Arrays;

public class smallest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,5,6,7};
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {

           // System.out.println(arr[i]);
            if( arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }
}

