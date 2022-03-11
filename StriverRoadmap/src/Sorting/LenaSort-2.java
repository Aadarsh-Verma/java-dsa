package Sorting;

import java.util.*;

public class LenaSort {
    static ArrayList<Integer> lenasort(ArrayList<Integer> arr,int start,int end){
        if(arr.size()<=1)
            return arr;
        int max=arr.get(0);
        ArrayList<Integer> right=new ArrayList<>();
        ArrayList<Integer> left=new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(arr.get(i)>max)
                right.add(arr.get(i));
            else
                left.add(arr.get(i));
        }
        ArrayList<Integer> left_result = lenasort(left,1,left.size()-1);
        ArrayList<Integer> right_result = lenasort(right,1,right.size()-1);
        ArrayList<Integer> final_result = new ArrayList<>();
        final_result.addAll(left_result);
        final_result.add(max);
        final_result.addAll(right_result);
        return final_result;

    }
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(9);    temp.add(6);
        temp.add(11);   temp.add(5);
        temp.add(11);   temp.add(2);
        temp.add(7);
        ArrayList<Integer> print = lenasort(temp,1,temp.size()-1);
        System.out.println(print);
    }
}
