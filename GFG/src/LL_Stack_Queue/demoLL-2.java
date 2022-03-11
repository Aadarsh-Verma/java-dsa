package LL_Stack_Queue;

import java.util.*;
import java.io.*;

public class demoLL {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insert(5);
        ll.insert(87);
        ll.print(ll);
        if(ll.next.next!=null)
            System.out.println(ll.next.next);
    }
}
