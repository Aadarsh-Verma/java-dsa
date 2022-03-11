package LL_Stack_Queue;

import java.util.*;
import java.io.*;

public class ReverseLLInGroups {
    public static void printLL(LL head) {
        LL temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static LL reverseLinkedList(LL head, int k) {
        if (head.next == null)
            return head;
        LL temp = head.next;
        LL prev = head;
        while (temp != null && k > 1) {
            LL next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            k--;
        }

        return prev;
    }


    public static void main(String[] args) {
        int k = 3;
        LL ll = new LL();
        LL linkedList = ll.getSampleLL();
        LL temp = linkedList.head;
        LL prev = linkedList.head;

        int cnt = 0;
        while (temp != null) {
            LL newHead = reverseLinkedList(temp, k);
            if (cnt != 0)
                prev.next = newHead;
            else
                linkedList.head = newHead;
            for (int i = 0; i < k - 1 && newHead.next != null; i++) {
                System.out.println(newHead.data);
                newHead = newHead.next;
            }
            prev = newHead;
            temp = newHead.next;
            cnt++;
            if (cnt == 50)
                break;
        }
        prev.next = null;
        System.out.println(linkedList.head.data);
        printLL(linkedList.head);

    }
}
