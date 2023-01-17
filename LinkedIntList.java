import java.lang.*;

public class LinkedIntList<T> {
    private ListNode front;

    public class ListNode
    {
        int data;
        ListNode next;
        ListNode(int d)
        {
            data = d;
            next = null;
        }
    }

    void removeDuplicates()
    {
        ListNode curr = front;

        while (curr != null)
        {
            ListNode temp = curr;
            while(temp != null && temp.data == curr.data)
            {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }
    public void removeAll(LinkedIntList list2) {
        ListNode previous = front;
        ListNode current = front;
        ListNode toRemove = list2.front;

        while (current != null && toRemove != null) {
            if (current.data < toRemove.data) {
                previous = current;
                current = current.next;
            } else if (current.data > toRemove.data) {
                toRemove = toRemove.next;
            } else {
                if (current == front) {
                    front = current.next;
                } else {
                    previous.next = current.next;
                }
                current = current.next;
            }
        }
    }
    public void firstLast() {
        // list is empty or has single element -> nothing to do
        if (front == null || front.next == null) {
            return;
        }

        // save the first
        ListNode first = front;

        // move the head
        front = front.next;

        // find the end
        ListNode current = front;
        while (current.next != null) {
            current = current.next;
        }

        // append the node
        current.next = first;

        // reset the next pointer of the new last node
        first.next = null;
    }

    public void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        if (front == null){
            front = new_node;
        }
        else {
            ListNode current = front;
            while (current.next != null){
                current = current.next;
            }
            current.next = new_node;
        }
    }

    void printList()
    {
        ListNode temp = front;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList<Integer> list = new LinkedIntList<Integer>();
        list.push(2);
        list.push(2);
        list.push(6);
        list.push(6);
        list.push(8);
        list.push(11);
        list.push(20);
        list.push(20);
        System.out.println("List before removal of duplicates");
        list.printList();
        list.removeDuplicates();
        System.out.println("List after removal of elements");
        list.printList();
        LinkedIntList<Integer> l1 = new LinkedIntList<Integer>();
        l1.push(1);
        l1.push(3);
        l1.push(5);
        l1.push(7);
        l1.printList();
        LinkedIntList<Integer> l2 = new LinkedIntList<Integer>();
        l2.push(1);
        l2.push(2);
        l2.push(3);
        l2.push(4);
        l2.push(5);
        l2.printList();
        l2.removeAll(l1);
        System.out.println("List 1 after removeAll");
        l2.printList();
        list.firstLast();
        list.printList();
    }
}