package Super_30;

import java.util.Arrays;
import java.util.Scanner;
// 16. How to check the equality of two arrays
public class Q_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int b[] = {1,9,3,4,5};

        boolean status = Arrays.equals(a,b);
        if (status == true){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }



    }
}
