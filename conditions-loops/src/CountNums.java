import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = in.nextInt();
        System.out.println("Enter target: ");
        int target = in.nextInt();
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == target){
                count++;
            }
            num = num /10;
        }
        System.out.println(count);
    }
}
