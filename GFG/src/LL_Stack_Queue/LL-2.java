package LL_Stack_Queue;

import java.util.*;

public class LL {

    public LL head = null;
    public LL next = null, tail = null;
    public int data;

    void insert(int data) {
        if (head == null) {
            head = new LL();
            head.data = data;
            head.next = null;
            tail = head;
        } else {
            LL temp = new LL();
            tail.next = temp;
            temp.data = data;
            temp.next = null;
            tail = temp;
        }
    }

    public void print(LL list) {
        LL temp = list.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public LL getSampleLL(){
        LL ll = new LL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);
        ll.insert(9);
        return ll;
    }

}
