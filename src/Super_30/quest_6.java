package Super_30;

import java.util.Scanner;
// Count number of digits in a number
public class quest_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        while (num>0){
            num = num/10;
            count++;
        }
        System.out.println("Number os counts: " + count);
    }
}
