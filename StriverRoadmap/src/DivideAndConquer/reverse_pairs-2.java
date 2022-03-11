package DivideAndConquer;

import java.util.*;

public class reverse_pairs {
    static int lower_bound(int[] arr,int x){
        int found = Arrays.binarySearch(arr,x);
        while(found<arr.length-1&&found>0){
            if(arr[found+1]==arr[found])
                found++;
            else
                break;
        }
        if(found==-1)
            return -1;
        if(-found==arr.length+1)
            return -1;
        if(found<0&&found!=-1){
            return -found-2;
        }

        return found;
    }
    static int reversePairs(int[] nums){
        int n=nums.length;
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int[] arr = nums;
            Arrays.sort(arr,i+1,n);
            int index = lower_bound(Arrays.copyOfRange(arr,i+1,n),nums[i]/2);
            System.out.println(index);
            if(index!=-1){
                count+=index+1;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
//        Arrays.sort(arr);
        System.out.println(reversePairs(arr));
    }
}
