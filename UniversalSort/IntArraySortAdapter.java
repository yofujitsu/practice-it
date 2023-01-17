package UniversalSort;

import UniversalSort.ArraySortAdapter;

public class IntArraySortAdapter implements ArraySortAdapter {
    public int compareElements(Object array, int pos1, int pos2) {
        int[] intArray = (int[]) array;
        if (intArray[pos1] < intArray[pos2]) {
            return -1;
        } else if (intArray[pos1] > intArray[pos2]) {
            return +1;
        } else {
            return 0;
        }
    }

    public void swapElements(Object[] array, int pos1, int pos2) {
        Object t = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = t;
    }
}
