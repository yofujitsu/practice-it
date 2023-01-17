import java.util.Stack;

public class Equals {
    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> storage = new Stack<Integer>();
        if (s1.size() != s2.size()) {
            return false;
        } else {
            boolean same = true;

            while (same && !s1.isEmpty()) {
                int num1 = s1.pop();
                int num2 = s2.pop();
                if (num1 != num2) {
                    same = false;
                }
                storage.add(num1);
                storage.add(num2);
            }

            while (!storage.isEmpty()) {
                s2.push(storage.pop());
                s1.push(storage.pop());
            }

            return same;
        }
    }
    public static void main(String[] args){
        Equals obj = new Equals();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);
        System.out.println(obj.equals(s1,s2));
    }
}