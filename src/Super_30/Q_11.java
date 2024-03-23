package Super_30;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
// 11. Check given number is prime or not
public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int count = 0;

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("Number is a prime number");
            } else {
                System.out.println("Not prime");
            }
        }
            else
            {
                System.out.println("Not prime");
            }
        }
    }

