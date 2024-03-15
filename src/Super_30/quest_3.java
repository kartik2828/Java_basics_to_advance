package Super_30;

import java.util.Scanner;

// Reverse a String
public class quest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string value: ");
        String a = sc.nextLine();

        // String builder method
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.reverse();
        System.out.println("Reverse value is: " + sb);



    }
}
