import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
         */
        Scanner in = new Scanner(System.in);
        int[][] arr1 = new int[3][];

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //variable of size of column is also possible
        int[][] arr2D = {
                {1, 2, 3},      // 0th index
                {4, 5},         // 1st index
                {6, 7, 8, 9}    // 2nd index
        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // prints no. of rows
        // input
        for (int row = 0; row < arr.length; row++) {
            // for every column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output - 1
        for (int row = 0; row < arr.length; row++) {
            // for every column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //output - 2
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println();

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
