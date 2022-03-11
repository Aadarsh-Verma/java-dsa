package array;

import java.util.*;
import java.io.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d = 2,n = arr.length;
        int curr = arr[d];
        for (int i = d; i < arr.length; i++) {
            int first = arr[i-d];
            int back_pos = n-1-(2*d-i-1);
            int back = arr[back_pos];

        }
    }
}
