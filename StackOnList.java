import java.util.*;

public class StackOnList<T> {
    private LinkedList<T> list;
    private int size;

    public int getSize(){
        return size;
    }

    public StackOnList() {
        this.list =  new LinkedList<>();
        this.size=0;
    }

    public void push(T a){
        list.add(size, a);
        size++;
    }
    public T pop(){
        if(size==0){
            return null;
        }
        return(list.get(size-1));
    }
}