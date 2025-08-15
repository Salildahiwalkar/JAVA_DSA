public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 76, 67, 136, 14, 28};
        int target = 136;
        System.out.println(linearSearch(arr, target, 1, 5));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}
