package Super_30;

// 8. Count sum of digits in a number

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num!=0)
        {
            sum = sum + num%10;  // 124
            num = num/10;
        }
        System.out.println(sum);
    }
}
