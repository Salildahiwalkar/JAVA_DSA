import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("Sugar and Heat Bomb");
                break;
            case "Apple":
                System.out.println("Red fruit that kills Doctors");
                break;
            case "Watermelon":
                System.out.println("Just buying red sweet water like a fool");
                break;
            case "Orange":
                System.out.println("Make Ashwin Richer");
                break;
            case "Grapes":
                System.out.println("Small green testicles");
                break;
            default:
                System.out.println("Ask for some stupid fruit");
        }

        switch (fruit) {
            case "Mango" -> System.out.println("Sugar and Heat Bomb");
            case "Apple" -> System.out.println("Red fruit that kills Doctors");
            case "Watermelon" -> System.out.println("Just buying red sweet water like a fool");
            case "Orange" -> System.out.println("Make Ashwin Richer");
            case "Grapes" -> System.out.println("Small green testicles");
            default -> System.out.println("Ask for some stupid fruit");
        }
         */

        int day = in.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}