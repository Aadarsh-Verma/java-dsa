package ll_stack_queue;

import java.util.*;
import java.io.*;

public class LRU {
    static class Node {
        int data;
        int size = 3;
        static int elements = 0;
        Node next, prev, head = null, tail = null;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public Node addLast(int data) {
            if (head == null) {
                head = new Node(data);
                elements++;
                return head;
            }
            Node itr = head;
            while (itr.next != null)
                itr = itr.next;
            Node temp = new Node(data);
            itr.next = temp;
            temp.prev = itr;
            elements++;
            return temp;
        }

        public Node addFirst(int data) {
            Node clone = head;
            head = new Node(data);
            head.next = clone;
            clone.prev = head;
            elements++;
            return head;
        }

        public void removeFirst() {
            head = head.next;
            head.prev = null;
            elements--;

        }

        public void remove(Node x) {
            if (x == head) {
                head = head.next;
                head.prev = null;
                elements--;
                return;
            }
            Node prev = x.prev;
            prev.next = x.next;
            x.prev = null;
            x.next = null;
            elements--;
        }

        public boolean isFull() {
            return elements == size;
        }

    }

    static HashMap<Integer, Node> map = new HashMap<>();

    static int fetch(Node queue, int data) {
//        Node queue = new Node();
        if (map.containsKey(data)) {
            Node del = map.get(data);
            queue.remove(del);
            queue.addLast(data);
            return data;
        } else {
            if (queue.isFull()) {
                queue.removeFirst();
            }
            queue.addLast(data);
        }
        printQueue(queue);
        return 0;
    }
    static void printQueue(Node queue){
        Node itr = queue.head;
        while(itr!=null){
            System.out.print(itr.data+" ");
            itr = itr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node queue = new Node();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
//        queue.addLast(4);
        printQueue(queue);
        fetch(queue,2);
    }
}
