// https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{3,2,1},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];
            }
            if(rowsum > max){
                max = rowsum;
            }
        }
        return max;
    }
}
