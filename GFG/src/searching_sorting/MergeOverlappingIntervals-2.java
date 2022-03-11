package searching_sorting;

import java.util.*;
import java.io.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,4},{6,8},{5,7},{7,11},{13,15}};
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int[] row:arr)
            System.out.println(Arrays.toString(row));


        ArrayList<int[]> list=new ArrayList<>();
        int[] initial = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(initial[1]>arr[i][0]){
                initial[1]=arr[i][1];
            }
            else{
                list.add(initial);
                initial = arr[i];
            }
        }
        list.add(initial);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }
    }
}

