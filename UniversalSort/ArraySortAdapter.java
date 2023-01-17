package UniversalSort;

public interface ArraySortAdapter {
    public abstract int compareElements(Object array, int pos1, int pos2);
    public abstract void swapElements(Object[] array, int pos1, int pos2);
}

