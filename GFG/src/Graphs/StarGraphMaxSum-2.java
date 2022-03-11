package Graphs;

import java.util.*;
import java.io.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    static class Pair {
        int x, y;

        public Pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    public int bestSumKStar(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> values, int k) {
        List<LinkedHashSet<Integer>> graph = new ArrayList<>();
        int n = gNodes;
        for (int i = 0; i < n; i++) {
            LinkedHashSet<Integer> temp = new LinkedHashSet<>();
            graph.add(temp);
        }
        for (int i = 0; i < gTo.size(); i++) {
            graph.get(gFrom.get(i)).add(gTo.get(i));
            graph.get(gTo.get(i)).add(gFrom.get(i));
        }
        ArrayList<Pair> weights = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            weights.add(new Pair(i, values.get(i)));
        }

        Collections.sort(weights, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return p2.y - p1.y;
            }
        });
//         for(Pair p:weights){
//         System.out.println(p.x+" "+p.y);
//         }
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < graph.size(); i++) {
            int curr_sum = values.get(i);
            if (graph.get(i).size() >= k) {
                System.out.println("doing node no " + i);
                ArrayList<Pair> weights_clone = new ArrayList<>(weights);
                System.out.println("Printing weights clone ");
                for (Pair p : weights_clone) {
                    System.out.println(p.x + " " + p.y);
                }
                int cnt = 0;
                for (int j = 0; cnt != k && j < weights_clone.size(); j++) {
//                    Pair temp = weights_clone.remove(0);
                    Pair temp = weights_clone.get(j);
                    System.out.println("removed pair " + temp.x + " " + temp.y);
                    int node = temp.x;
                    int weight = temp.y;
                    if (graph.get(i).contains(node)) {
                        System.out.println("adding node " + node + " weight " + weight);
                        curr_sum += weight;
                        cnt++;
                    }
                }
                max_sum = Math.max(max_sum, curr_sum);
            }
        }
        return max_sum;
    }

}

public class StarGraphMaxSum {
    public static void main(String[] args) {
        int n = 7, k = 2;
        List<Integer> from = Arrays.asList(0, 1, 1, 3, 3, 3);
        List<Integer> to = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 10, -10, -20);
        Result r = new Result();
        int ans = r.bestSumKStar(n, from, to, values, k);
        System.out.println(ans);
    }
}
