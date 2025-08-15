public class MethodOverloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    static void fun(String a){

    }
}
