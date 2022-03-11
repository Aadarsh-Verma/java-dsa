package BinarySearch;

import java.util.*;

public class bishu_and_soldiers {
    static int higher_bound(int[] arr,int x){
        if(x>arr[arr.length-1])
            return arr.length;
        int found = Arrays.binarySearch(arr,x);
        while(found>0&&found<arr.length-2){
            if(arr[found+1]==arr[found])
                found++;
            else
                break;
        }
        if(found<0&&found!=-1){
            return -found-2;
        }
        return found;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int[] query = new int[x];
        for (int i = 0; i < x; i++) {
            query[i]=sc.nextInt();
        }

        for (int i = 0; i < x; i++) {
            int num = query[i];
            int sum=0;
            int index = higher_bound(arr,num);
            if(index==arr.length)
                index=arr.length-1;
            if(index<0)
                sum=0;
            else {
                for (int j = 0; j <= index; j++) {
                    sum+=arr[j]
                    ;
                }
            }
            System.out.println(arr[index]+" "+sum);
        }

    }
}
