package BinarySearch;

import java.util.*;

public class aggressive_cow_2 {
//    static ArrayList<Integer> list = new ArrayList<>();
    static boolean IsFeasible(int[] arr, int k,int mid) {
        int last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-last>=mid){
                k--;
                last = arr[i];
            }
            if(k==0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(IsFeasible(new int[]{1,2,4,8,9},2,2));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            int low = 1;
            int high = arr[arr.length-1]-1;
            int mid = 0;
            int ans = 0;
            while (low <= high) {
                mid = (low + high) / 2;
                boolean isFeasible = IsFeasible(arr,k-1,mid);
//                System.out.println(low+":"+mid+":"+high);
                if(isFeasible){
                    ans = mid;
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
