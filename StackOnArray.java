public class StackOnArray<T> {
    private int size;
    private int top;
    private int[] arr;

    public StackOnArray(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    //  Метод, удаляющий последний элемент стека
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else return arr[top--];
    }
    //  Метод, возвращающий последний элемент стека
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else return arr[top];
    }
    //  Метод, добавляющий элемент в стек
    public void push(int a) {
        int i = ++top;
        arr[i] = a;
    }


    public static void main(String[] args) {
        StackOnArray<Number> stack = new StackOnArray<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(5);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
