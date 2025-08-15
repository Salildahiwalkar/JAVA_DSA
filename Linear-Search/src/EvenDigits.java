// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int ans = findNumber(nums);
        System.out.println(ans);
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int i: nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int i) {
        String num = Integer.toString(i);
        int length = num.length();
        if(length % 2 == 0){
            return true;
        }
        return false;
    }
}
