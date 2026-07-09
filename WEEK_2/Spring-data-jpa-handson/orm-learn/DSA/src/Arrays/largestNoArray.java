package Arrays;

public class largestNoArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,5,6,7};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
            if( arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);

    }
}
