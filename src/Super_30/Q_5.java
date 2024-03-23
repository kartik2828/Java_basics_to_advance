package Super_30;

import java.util.Scanner;
// 5. Pallindrome String
public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        String org_str = a;

        String rev = "";

        int len = a.length();

        for (int i=len-1; i>=0; i--)
        {
            rev = rev + a.charAt(i);
        }

        if (org_str.equals(rev))
        {
            System.out.println("String is a pallindrome");
        }
        else {
            System.out.println("String is not a pallindrome");
        }

    }
}
