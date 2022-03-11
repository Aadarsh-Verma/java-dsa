import java.util.*;
import java.io.*;

public class interview {
    static class Node {
        int data;
        Node next;
    }

    static int getPriority(char ch) {
        if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("A");
    }
}
