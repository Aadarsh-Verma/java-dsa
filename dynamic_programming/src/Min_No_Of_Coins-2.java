import java.util.*;

public class Min_No_Of_Coins {
    static int minCoins(int[] arr,int n,int sum){
        if(sum==0)
            return 0;
        int temp = Integer.MAX_VALUE-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=sum){
                int subtemp=1+minCoins(arr,n,sum-arr[i]);
                temp=Math.min(temp,subtemp);
            }
        }
        return temp;
    }
    static int findMin(int[] arr,int n,int sum){
        if(sum<=0)
             return 0;
        if(n==0)
            return Integer.MAX_VALUE/2;
        int n1=0;
        if(arr[n-1]<=sum)
            n1 = 1+findMin(arr,n,sum-arr[n-1]);
        else{
            return findMin(arr,n-1,sum);
        }
        int n2 = findMin(arr,n-1,sum);
        return Math.min(n1,n2);
    }
    public static void main(String[] args) {
        int[] arr={25,5,10,15};
        int sum = 105;
        System.out.println(minCoins(arr,arr.length,sum));
        System.out.println(findMin(arr,arr.length,sum));
    }
}
