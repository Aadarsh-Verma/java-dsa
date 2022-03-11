package arrays;

import java.util.*;
import java.io.*;

public class InfiniteGrid {
    static int dist(int x1,int y1,int x2,int y2){
        if(Math.abs(x2-x1)==Math.abs(y2-y1))
            return Math.abs(x2-x1);
        else{
            return Math.abs(x2-x1) + Math.abs(y2-y1);
        }
    }
    public static int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int x = a.get(0);
        int y = b.get(0);
        int dist = 0;
        for( int i = 1; i < a.size(); i++){
            int temp= dist(x,y,a.get(i),b.get(i));
            System.out.println(x+","+y+" and "+a.get(i)+","+b.get(i)+" is "+temp);
            dist+=temp;
            x = a.get(i);
            y = b.get(i);
        }
        return dist;

    }
    public static void main(String[] args) {
        Integer[] arr={4, 8, -7, -5, -13, 9, -7, 8};
        Integer[] brr={4, -15, -10, -3, -13, 12, 8, -8};

        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list, arr);
        ArrayList<Integer> list2=new ArrayList<>();
        Collections.addAll(list2, brr);
        System.out.println(coverPoints(list,list2));
    }
}
