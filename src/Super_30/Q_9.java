package Super_30;

import java.util.Scanner;

// 9. Find largest of 3 Numbers

public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b & a>c){
            System.out.println("a is greater");
        } else if (b>a & b>c) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("C is greater");
        }
    }
}
