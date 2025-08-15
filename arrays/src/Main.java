public class Main {
    public static void main(String[] args) {
        /* syntax
        data_type[] variable_name = new data_type[size];


        int[] rollno1 = new int[5];
        // or directly
        int[] rollno2 = {45, 57, 19, 3};

         */

        int[] rnos; //declaration of array: rnos is getting defined in stack
        rnos = new int[4]; //initialisation: actually here the object is getting created in heap memory

        String[] name = new String[5];
        System.out.println(name[0]);

    }
}