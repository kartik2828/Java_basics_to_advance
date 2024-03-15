package Super_30;

import java.util.Scanner;
// Reverse a Number
public class question_2_b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// USing algorithm
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        while (num!=0)

        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse number is: " + rev);

    }
}
