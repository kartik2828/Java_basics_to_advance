package function;

import java.util.Scanner;

// Find the factorial of a number
public class program4 {

    public static void factorial(int num){
        if (num<0){
            System.out.println("invalid input");
            return;
        }
        int fact =1;
        for (int i=num; i>=1; i--){
            fact = i*fact;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        factorial(num);
    }
}
