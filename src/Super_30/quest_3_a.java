package Super_30;

import javax.management.StringValueExp;
import javax.sound.sampled.ReverbType;
import java.util.Scanner;

// Reverse a String
public class quest_3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string value: ");
        String a = sc.nextLine();

        // String buffer method
        StringBuffer sb = new StringBuffer(String.valueOf(a));
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse string is: " + rev);

    }
}
