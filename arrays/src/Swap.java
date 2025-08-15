import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {12, 54, 3, 87, 53};
        int[] arr2 = {42, 648, 8, 345, 84, 6};

        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
