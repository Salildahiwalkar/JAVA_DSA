public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; // the class variable at line 4 shadowed by this
        // System.out.println(x); scope will begin ehrn the value is initialised
        x = 40;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
