class ArrayIntList {
    private int[] elementData;

    public ArrayIntList(int[] list) {
        this.elementData = list;
    }

    public int longestSortedSequence() {
        if (elementData.length == 0) {
            return 0;
        }
        int lss = 1;
        int maxlss = 0;
        for (int i = 1; i < elementData.length; i++) {
            if (elementData[i - 1] < elementData[i]) {
                lss++;
            } else {
                maxlss = Integer.max(lss, maxlss);
                lss = 1;
            }
        }
        maxlss = Integer.max(lss, maxlss);
        return maxlss;
    }

    public static void main(String[] args) {
        ArrayIntList list=new ArrayIntList(new int[]{1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17});
        System.out.println(list.longestSortedSequence());
    }
}
