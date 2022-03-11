package Greedy;

import java.util.*;

public class k_multiple_free_set_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%k!=0) {
                count++;
                set.add(arr[i]);
            }
            else if(!set.contains(arr[i]/k)){
                count++;
                set.add(arr[i]);
            }
        }
        System.out.println(count);

    }
}

/*BASIC.A k-multiple free set is a set of integers where there is no pair of integers where one is equal to another integer multiplied by k.
That is, there are no two integers x and y (x,y) from the set, such that y=x·k.
inputCopy
6 2
2 3 6 5 4 10
outputCopy
3
Note
In the sample input one of the possible maximum 2-multiple free subsets is {4, 5, 6}.*/