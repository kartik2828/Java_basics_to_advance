package Super_30;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Reverse a Number
public class quest_2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        // String builder method
        StringBuilder sbl = new StringBuilder();
        sbl.append(a);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse number is: " + rev);

    }

}
