package function;

import java.util.Scanner;

// Make a function to add 2 numbers and return the sum.
public class program2 {

    public static int addTwoNumbers(int a, int b){
         int sum = a + b;
         return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addTwoNumbers(a,b);
        System.out.println(sum);
    }
}
