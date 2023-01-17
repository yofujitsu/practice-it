

import java.util.LinkedList;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> a1 = new LinkedList<>();
        LinkedList<Integer> a2 = new LinkedList<>();
        for(int i = 1; i < 6;i++){
            a1.add(i);
        }
        for(int i = 6; i < 13;i++){
            a2.add(i);
        }
        int max_size = Math.max(a1.size(), a2.size());
        for(int i = 0; i < max_size; i++){

        }

    }
}
