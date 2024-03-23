package Super_30;

import java.util.Scanner;
// 15. Print even & odd numbers from an array
public class Q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a[] = {1,2,3,4,5,6,7};
        System.out.println("Even numbers are:");

         for (int i=0; i<a.length; i++) {
             if (a[i] % 2 == 0) {
                 System.out.println(a[i]);
             }
         }

        System.out.println("Odd numbers are:");

        for (int i=0; i<a.length; i++) {
             if (a[i] % 2 != 0) {
                 System.out.println(a[i]);
                 }
             }
    }

}
