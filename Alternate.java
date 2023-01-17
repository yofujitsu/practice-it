import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alternate {
    public List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();
        List<Integer> result = new ArrayList<Integer>();

        while (i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext()) {
                result.add(i1.next());
            }
            if (i2.hasNext()) {
                result.add(i2.next());
            }
        }
        return result;
    }
    public static void main(String[] args){
        Alternate obj1 = new Alternate();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        System.out.println(obj1.alternate(l1,l2));
    }
}