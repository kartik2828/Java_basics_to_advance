package Super_30;

// 13. Factorial of a number

import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
         int num = sc.nextInt();
         int factorial =1;

         for (int i=num; i>=1; i--){

             factorial = factorial * i;
         }
        System.out.println(factorial);
    }
}
