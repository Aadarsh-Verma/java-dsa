package Hashing;

import java.util.*;
import java.io.*;

public class Pair_Sum_Difference {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        int[] arr={0, -1, -2, 2, 1};
        int n = arr.length, k = 1;
        ArrayList<Integer[]> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = arr[i],b = arr[i]-k;
            if(arr[i]<0){
                int x = arr[i];
                if(hash.contains(k+arr[i])){
                    list.add(new Integer[]{arr[i]+k,arr[i]});
                }
                if(hash.contains(arr[i]-k)){
                    list.add(new Integer[]{arr[i],k});
                }
                hash.add(arr[i]);
                continue;
            }
            if(hash.contains(arr[i]-k)){
                list.add(new Integer[]{a,b});
            }
            if(hash.contains(k+arr[i])){
                list.add(new Integer[]{k+arr[i],a});
            }
            hash.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }
    }
}
