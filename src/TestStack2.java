class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и иниц его
    Stack(int size){
        stck = new int[size];
        tos = -1;
    }
    // разместить элемент в стеке
    void push(int item){
        System.out.println(" tos= "+ tos + " stck.length = " + stck.length);
        if(tos ==stck.length-1)
            // используем свойство длины массива
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    // извлекаем элемент из стека
    int pop() {
        if(tos<0){
            System.out.println("Stack is empty.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(1);
        //Stack mystack2 = new Stack(8);
        //разместить числа в стэк
        for (int     i=0; i<5; i++) mystack1.push(i);
//        for (int i=0; i<8; i++) mystack2.push(i);
        // извлечь числа из стека
        System.out.println("Stack1 ");
        for(int i=0;i<5;i++)
            System.out.println(mystack1.pop());

//        System.out.println("Stack2 ");
//        for(int i=0;i<8;i++)
//            System.out.println(mystack2.pop());
    }
}
