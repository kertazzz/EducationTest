class StaticDemo1 {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}
class StaticDemo {
    public static void main(String[] args) {
        StaticDemo1.callme();
        System.out.println("b = " + StaticDemo1.b);
    }
}
