package Arrays;

public class average {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6};
        int sum  =0 ;
        int aver = 0 ;
        for (int i = 0; i<arr.length;i++){
            sum += arr[i];
            aver=sum;
            aver = aver/arr.length;
        }
        System.out.println(aver);
    }
}
