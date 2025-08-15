import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(78);
        list.add(796);
        list.add(648);
        list.add(2);
        list.add(278);
        list.add(974);
        list.add(21);
        list.add(78);

        System.out.println(list);
        System.out.println(list.contains(974));
        list.set(0, 99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        
        //output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index through get, list[index] will not work here
        }
    }
}
