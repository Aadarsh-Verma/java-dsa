package TreesVariation;
import java.util.*;
import java.io.*;

public class SegmentTrees {
    static int N;
    static int[] tree;
    static int[] arr;

    static int build(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = start + (end - start) / 2;
            build(2 * node + 1, start, mid);
            build(2 * node + 2, mid + 1, end);
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
        return tree[node];
    }

    static void update(int node, int start, int end, int idx, int val) {
        if (start == end && start==idx) {
            // Leaf node
            arr[idx] = val;
            tree[node] = val;
        } else {
            int mid = (start + end) / 2;
            if (start <= idx && idx <= mid) {
                update(2 * node + 1, start, mid, idx, val);
            } else {
                update(2 * node + 2, mid + 1, end, idx, val);
            }
            tree[node] = tree[2 * node + 2] + tree[2 * node + 1];
        }
    }

    static int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        int p1 = query(2 * node + 1, start, mid, l, r);
        int p2 = query(2 * node + 2, mid + 1, end, l, r);
        return (p1 + p2);
    }

    public static void main(String[] args) {
        N = 6;
        arr = new int[]{1, 3, 5, 7, 9, 11};
        int x = (int) (Math.ceil(Math.log(N) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        tree = new int[max_size];
        build(0, 0, N - 1);
        System.out.println(Arrays.toString(tree));

        System.out.println(query(0,0,N-1,0,3));
        update(0,0,N-1,1,10);
        System.out.println(Arrays.toString(tree));
        update(0,0,N-1,4,0);
        System.out.println(Arrays.toString(tree));
    }
}

//[36, 9, 27, 4, 5, 16, 11, 1, 3, 0, 0, 7, 9, 0, 0]