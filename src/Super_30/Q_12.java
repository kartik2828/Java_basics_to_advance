package Super_30;

// 12. How to generate random number & strings

import java.util.Random;

public class Q_12 {
    public static void main(String[] args) {

        Random rand = new Random();
         int org_rand = rand.nextInt(1000);
        System.out.println(org_rand);
    }
}
