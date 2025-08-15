import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String greet = "Hello " + name;
        return greet;
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
