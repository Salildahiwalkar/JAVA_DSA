public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 38, 19, 364, -3, -78, 146, 136, -864};
        int target = 47119;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //search in array, return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for looop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // this line will execute if none of the return statements above is executed
        // hence target not found
        return -1;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for looop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above is executed
        // hence target not found
        return Integer.MAX_VALUE;
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        //run a for looop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        // this line will execute if none of the return statements above is executed
        // hence target not found
        return false;
    }
}