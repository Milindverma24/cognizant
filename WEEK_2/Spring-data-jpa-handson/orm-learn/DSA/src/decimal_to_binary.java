import java.util.Scanner;
class decimal_to_binary{
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int no = sc.nextInt();
        String c = " ";
        while( no > 0){
            int rem = no % 16;
            c = rem + c ;
            no = no/16;
        }
        System.out.println("The binary number is : " + c);
    }
}

