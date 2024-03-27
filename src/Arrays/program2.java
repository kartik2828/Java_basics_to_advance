package Arrays;

import java.util.Scanner;

// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        // input
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        int num = sc.nextInt();
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                if(arr[i][j]==num){
                    System.out.println("Number found at location ("+ i + "," + j + ")");
                }
            }
        }
    }
}
