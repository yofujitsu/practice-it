import java.util.*;
import java.lang.*;

public class ReverseHalf {

    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();
        int size = q.size();

        for(int i = 0; i < size; i++) {
            if(i % 2 == 1)
                s.push(q.remove());
            else
                q.add(q.remove());
        }

        while(!s.isEmpty()) {
            q.add(q.remove());
            q.add(s.pop());
        }

        if(size % 2 == 1)
            q.add(q.remove());

        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<Integer>();
        q1.add(1);
        q1.add(8);
        q1.add(7);
        q1.add(2);
        q1.add(9);
        q1.add(18);
        q1.add(12);
        q1.add(0);
        reverseHalf(q1);
    }
}
