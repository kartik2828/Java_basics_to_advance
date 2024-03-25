package function;

import java.util.Scanner;

// Make a function to multiply 2 numbers and return the product
public class program3 {
    public static int productOfTwoNumber(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = productOfTwoNumber(a,b);
        System.out.println("Product of two number: " + product);


    }
}
