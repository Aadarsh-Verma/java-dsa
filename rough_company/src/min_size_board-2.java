import java.util.*;
import java.io.*;

public class min_size_board {
    static boolean isFeasible(int row,int n,int k){
        int ans = (int)Math.ceil((double)row/n);
        return ans*2>=n;
    }
    static int fits(int k,int n){
        int low = 1,high = n*k,ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(mid,n,k)){
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int k = 2;
        int n = 5;
        System.out.println(fits(k,n));
    }
}
