package Super_30;

import java.util.Scanner;
// 7. Count number of even and odd digits in a number

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();


        int Evencount = 0;
        int Oddcount = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                Evencount++;
            } else {
                Oddcount++;
            }
            num = num/10;
        }
        System.out.println("Even count is: " + Evencount);
        System.out.println("Odd count is: " + Oddcount);

    }
}
