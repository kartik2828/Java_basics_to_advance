package Super_30;


import java.util.Scanner;

// 10. Generate Fibonacci series
public class Q_10 {
    public static void main(String[] args) {

        int a = 0, b = 1, sum = 0;

        System.out.println(a+ " " +b);
        for (int i =1; i<10; i++)
        {
            sum =  a + b ; // 0+1
            System.out.println(sum);
            a = b ; //1
            b = sum; //1

        }

    }
}
