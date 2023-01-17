import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int n = q.remove();
            q.add(n);
            s.push(n);
        }
        for (int i = 0; i < size; i++) {
            int n1 = q.remove();
            int n2 = s.pop();
            if (n1 != n2) {
                return false;
            }
            q.add(n1);
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<Integer>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(2);
        q1.add(1);
        System.out.println(isPalindrome(q1));
        q1.clear();

        q1.add(1);
        q1.add(2);
        q1.add(6);
        q1.add(6);
        q1.add(1);
        System.out.println(isPalindrome(q1));
        q1.clear();


    }
}
