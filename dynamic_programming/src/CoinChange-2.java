import java.util.Arrays;

public class CoinChange {
    static int coinChangeDP(int[] arr,int n,int sum){
        int[][] dp=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0&&j!=0) dp[i][j]=0;
                else if(j==0) dp[i][j]=1;
                else if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i][j-arr[i-1]];
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        for (int[] row:dp) {
            System.out.println(Arrays.toString(row));
        }
        return dp[n][sum];
    }
    static int coinChangeRecursive(int[] arr,int n,int sum){
        if(sum==0) return 1;
        if(n==0&&sum!=0) return 0;
        if(arr[n-1]<=sum){
            return coinChangeRecursive(arr,n,sum-arr[n-1])+coinChangeRecursive(arr,n-1,sum);
        }
        else
            return coinChangeRecursive(arr,n-1,sum);
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4};
        System.out.println(coinChangeDP(array,array.length,5));
//        System.out.println(coinChangeRecursive(array,array.length,5));
    }
}
