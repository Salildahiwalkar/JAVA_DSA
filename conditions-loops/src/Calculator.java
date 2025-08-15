import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press x or X
        int ans = 0;
        while (true) {
            //take operator as input
            System.out.println("Enter Operation: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter number-1: ");
                int a = in.nextInt();
                System.out.println("Enter number-2: ");
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                else if (op == '-') {
                    ans = a - b;
                }
                else if (op == '*') {
                    ans = a * b;
                }
                else if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                else {
                    if (b != 0) {
                        ans = a % b;
                    }
                }
            }else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println("Answer: "+ans);
        }
    }
}