package searching_sorting;

import java.util.*;
import java.io.*;

class Pair {
    int x, y;

    public Pair(int a, int b) {
        x = a;
        y = b;
    }
}


public class PairSort {

    public static void main(String[] args) {
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Pair(i, i + 1));
        }
        for(Pair p:list)
            System.out.println(p.x+" "+p.y);
        list.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.x - o1.x;
            }
        });
        for(Pair p:list)
            System.out.println(p.x+" "+p.y);
    }
}
