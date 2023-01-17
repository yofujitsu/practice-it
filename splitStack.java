import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class splitStack {
    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        int sizeOfStorage = q.size();

        for (int i = 0; i < sizeOfStorage; i++) {
            int num = q.remove();
            if (num < 0) {
                s.push(num);
            } else {
                q.add(num);
            }
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        stack.push(1);
        stack.push(-2);
        stack.push(2);
        stack.push(-3);
        stack.push(3);
        splitStack.splitStack(stack);
        System.out.println(stack);
    }
}
