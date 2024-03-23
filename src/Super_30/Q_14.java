package Super_30;


// 14. Find sum of element in an array

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a[] = {1,2,3,4,5};
        int sum = 0;

        for (int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of the given array is: " + sum);

    }

}
