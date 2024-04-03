package Arrays;

import java.util.Scanner;
import java.util.*;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        // input
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }

        }

// output
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
