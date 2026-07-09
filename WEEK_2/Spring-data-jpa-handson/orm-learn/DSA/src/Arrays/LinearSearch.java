package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int[]{9,8,3,5,7};
        int count = 0;
        for (int i=0; i< arr.length ;i++){
            if ( arr[i]==3){
                count++;
                System.out.println(i);
            }
        }

    }
}
