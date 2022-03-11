package arrays;

import java.util.*;
import java.io.*;

public class MajorityElement {
    /* Input => [3,5,3,7,3,6,3]
    Output => 0 or 2 or 4 or 6*/
    public static void main(String[] args) {
        int[] arr={3,5,3,7,6,3,7,7,7};
        int res = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[res]!=arr[i])
                count--;
            else
                count++;
            if(count==0){
                count=1;
                res = i;
            }
        }
        System.out.println(res);
    }
}
