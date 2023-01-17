public class ArrayListOnArray {
    private int[] array;
    private int size;

    public ArrayListOnArray() {
        array = new int[10];
        size = 0;
    }

    public void add(int element) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return size;
    }
}
