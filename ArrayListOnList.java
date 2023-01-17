import java.util.*;

public class ArrayListOnList<T> {

    private List<Object> list;

    public ArrayListOnList() {
        list = new LinkedList<Object>();
    }

    public void add(Object o) {
        list.add(o);
    }

    public void remove(Object o) {
        list.remove(o);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        ArrayListOnList<Integer> list = new ArrayListOnList<Integer>();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);

        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
