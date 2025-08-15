import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 5, 3, 8, 4, 5, 4, 6);
    }

    static void demo(int ...v){

    }
    static void demo(String ...v){

    }

    // ...v variable length of arguments, can pass any amount of arguments
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // this is also possible but the variable argument should be at last always
    static void multiple(int a, int b, String ...v){

    }
}
