package Super_30;

import java.util.*;

// Pallindrome Number
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int original_num = num;

        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if (original_num==rev){
            System.out.println("Number is Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome number");
        }

    }
}
