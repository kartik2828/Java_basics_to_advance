package Super_30;

import java.util.Scanner;
// Reverse a Number
public class question_2_a {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // StringBuffer method
        StringBuffer sbf = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sbf.reverse();

        System.out.println("Reverse number is: " + rev);

    }
}
