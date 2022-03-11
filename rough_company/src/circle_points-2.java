import java.util.*;
import java.io.*;

public class circle_points {
    public static int lower(ArrayList<Double> arr,int key){
        int low = 0;
        int high = arr.size()-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr.get(mid) >= key){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        while(low<arr.size()-1 && arr.get(low)==arr.get(low+1))
            low++;
        return low;
    }
    static int points(int cnt_point,ArrayList<ArrayList<Integer>> points,int cnt_query,ArrayList<ArrayList<Integer>> queries){
        ArrayList<Double> list=new ArrayList<>();
        for (int i = 0; i < cnt_point; i++) {
            int x = points.get(i).get(0);
            int y = points.get(i).get(1);
            double dist = Math.sqrt(x*x+y*y);
            list.add(dist);
        }
        Collections.sort(list);


        return 0;
    }
    public static void main(String[] args) {

    }
}
