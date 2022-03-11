package ll_stack_queue;

import java.util.*;
import java.io.*;

public class reverse_in_pairs {

    static class LL {
        LL head = null, next;
        int data;

        public LL() {

        }

        public LL(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static LL sampleLL() {

        LL ll = new LL(1);
        ll.head = ll;
        ll.next = new LL(2);
        ll.next.next = new LL(3);
        ll.next.next.next = new LL(4);
        ll.next.next.next.next = new LL(5);
        ll.next.next.next.next.next = new LL(6);
        ll.next.next.next.next.next.next = new LL(7);
        return ll;
    }

    static LL reverse(LL head) {
        LL prev = null, curr = head, next = head;
        while (next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static LL reverseInPairs(LL head, int k) {
        if (head == null)
            return null;
        int k_ = k;
        LL curr = head, next = curr, prev = null;
        while (next != null && k_-- > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseInPairs(next, k);
        return prev;
    }

    static void printLL(LL head) {
        LL temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL ll = sampleLL();
        printLL(ll.head);
//        LL rev = reverse(ll.head);
//        printLL(rev);
        LL revInPairs = reverseInPairs(ll.head, 4);
        printLL(revInPairs);
    }
}
