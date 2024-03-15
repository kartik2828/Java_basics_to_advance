package Super_30;

import java.util.Scanner;
 // Palindrome String
public class Pallindrome_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string value: ");
        String value = sc.nextLine();

        StringBuilder sb = new StringBuilder(value);
        String rev =  sb.reverse().toString();

        if (value.equals(rev)) {
            System.out.println("Value is Palindrome");
        }
        else {
            System.out.println("Value is s not Palindrome");
        }


    }
}
