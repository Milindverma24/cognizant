package Arrays;

public class EvenAndOddCount {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,4,9,6,100};
        int evcount = 0;
        int odcount = 0;
        for (int i = 0; i< arr.length ; i++){
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
                System.out.println();
                evcount = evcount + 1;
            }

            else if (arr[i]%2!=0)
            {
                System.out.println();
                System.out.print(arr[i]+" ");
                odcount = odcount+1;
            }


        }
        System.out.println();
        System.out.println(evcount+ " ,  "+odcount);
    }
}
