import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class copyStack {
    public static Stack<Integer> copyStack(Stack<Integer> s) {
        Stack<Integer> copy = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        while (!s.isEmpty()) {
            copy.push(s.pop());
        }

        while (!copy.isEmpty()) {
            int num = copy.pop();
            q.add(num);
            s.push(num);
        }
        while (!q.isEmpty()) {
            copy.push(q.remove());
        }
        return copy;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);
        copyStack obj = new copyStack();
        System.out.println(obj.copyStack(s1));
    }
}
