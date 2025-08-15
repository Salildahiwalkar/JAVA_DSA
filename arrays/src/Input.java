import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 24;
        arr[1] = 468;
        arr[2] = 45;
        arr[3] = 78;
        arr[4] = 7786;

        //System.out.println(arr[3]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        /*
        //output method 1
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //output method 2 enhanced for loop (also called for each loop)
        for (int i : arr) { //for every element in array, print the element
            System.out.print(i + " ");  //here i represents element of array
        }

         */
        //output method 3
        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
