import java.util.*;

public class QueueOnStack<T> {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int size;

    public QueueOnStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        size = 0;
    }

    public void add(T data)
    {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push((Integer) data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public T remove()
    {
        if (s1.isEmpty())
        {
            System.out.println("пустой!!");
            System.exit(0);
        }

        return (T) s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public void printQueue() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
            System.out.println(s2.peek());
        }
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        QueueOnStack<Integer> q = new QueueOnStack<Integer>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(2);
        q.printQueue();
        System.out.println("_");
        q.remove();
        q.printQueue();
        System.out.println("_");
        System.out.println(q.peek());
    }
}