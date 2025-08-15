/*
    Anything that is initialised outside the block can be used inside block
    Anything initialised inside block cannot  be used outside the block
    Anything initialised outside cannot be initialised inside block but
    anything initialised inside can be
 */

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            // int a = 78; // already initialised outside the block in the same method,
            // hence you cannot initialise again
            a = 100; //reassign origin ref variable to some other value
            System.out.println(a);
            int c = 98;
            System.out.println(c);
            // values initialised in this block remains in block
        }
        int c = 45;
        // sout(c) cannot be used outside block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        // System.out.println(i);  cannot be accessed
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

}
