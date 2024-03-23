package Super_30;

// 6. Count number of digits in a number

import javax.sql.rowset.spi.SyncFactory;
import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();
        int count = 0;

        while  (num>0){
            num = num/10;
            count++;

        }
        System.out.println(count);
    }
}
