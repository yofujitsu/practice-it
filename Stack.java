import java.util.ArrayDeque;
import java.util.Queue;

// Реализация stack с помощью двух queue
class Stack<T>
{
    Queue<T> q1, q2;

    // Конструктор
    public Stack()
    {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    // Вставляем элемент в stack
    void add(T data)
    {
        // Перемещаем все элементы из первой очереди во вторую queue
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        // Поместить данный элемент в первую queue
        q1.add(data);

        // Перемещаем все элементы обратно в первую queue из второй очереди
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // Удаляем верхний элемент из stack
    public T poll()
    {
        // если первая queue пуста
        if (q1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // вернуть первый элемент из первой queue
        T front = q1.peek();
        q1.poll();

        return front;
    }

    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };

        // вставляем указанные выше ключи в stack
        Stack<Integer> s = new Stack<Integer>();
        for (int key: keys) {
            s.add(key);
        }

        for (int i = 0; i <= keys.length; i++) {
            System.out.println(s.poll());
        }
    }
}
