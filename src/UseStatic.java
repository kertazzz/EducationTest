public  class UseStatic {
    static int a = 3;
    static int b;
    int c = 4;

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    static {
        System.out.println("Static unit initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
