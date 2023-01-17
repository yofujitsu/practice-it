import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;
import java.util.*;

public class GuavaSort {
    public static void guavaSort(String[] a) {
        Multiset<String> mset = TreeMultiset.create(); // array -> multiset
        for (int i = 0; i < a.length; i++) {
            mset.add(a[i]);
        }
        int index = 0; // multiset -> array
        Iterator<String> itr = mset.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            a[index] = s;
            index++;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        guavaSort(arr);
        for(String s: arr) System.out.print(s+" ");
    }
}
