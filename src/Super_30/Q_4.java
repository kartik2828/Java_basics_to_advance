package Super_30;

import java.util.Scanner;

// 4. Pallindrome Number
public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int org_num = num;
        int rev =0;

        while (num!=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (org_num == rev)
        {
            System.out.println("Number is Pallindrome");
        }else {
            System.out.println("Number is not Pallindrome");
        }
    }
}
