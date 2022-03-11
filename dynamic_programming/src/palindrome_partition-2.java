public class palindrome_partition {
    static boolean isPalindrome(String str, int i, int j) {
        if (i == j || i > j)
            return true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;    j--;
        }
        return true;
    }
    static int[][] dp=new int[6][6];
    static int palindrome(String str, int i, int j) {
        //base condition
        if (i >= j || isPalindrome(str, i, j)) return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        //main function
        int minPartition = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            //int temp = 1 + palindrome(str, i, k) + palindrome(str, k + 1, j);
            //OPTIMISED
            int left=0,right=0;
            if(dp[i][k]!=-1)
                 left=dp[i][k];
            else
                left=palindrome(str,i,k);
            if(dp[k+1][j]!=-1)
                right=dp[k+1][j];
            else
                right=palindrome(str,k+1,j);
            int temp=left+right+1;                //OPTIMISED

            minPartition = Math.min(temp, minPartition);
        }
        return dp[i][j]=minPartition;
    }

    public static void main(String[] args) {
        String str = "abcde";

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(palindrome(str, 0, str.length() - 1));

    }

}
