import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Salil Dahiwalkar");
                break;
            case 2:
                System.out.println("Satyam Nagpure");
                break;
            case 3:
                System.out.println("EmpID 3");
                switch (department){
                    case "IT":
                        System.out.println("Technical");
                        break;
                    case "Management":
                        System.out.println("Planning");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        switch (empID) {
            case 1 -> System.out.println("Salil Dahiwalkar");
            case 2 -> System.out.println("Satyam Nagpure");
            case 3 -> {
                System.out.println("EmpID 3");
                switch (department) {
                    case "IT" -> System.out.println("Technical");
                    case "Management" -> System.out.println("Planning");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
