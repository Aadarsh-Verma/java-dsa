package ll_stack_queue;

import java.util.*;
import java.io.*;


public class KStacks {

    static void test(int[] arr,int k){
        int n = arr.length;
        for(int i=k;i<n;i++)
            System.out.print(arr[i]+" ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int k = 2;
        test(arr,k);

    }
}
