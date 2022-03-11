import java.util.*;

public class LongestPalindromeSubstring {
    static String lps(String a){
        int max=0,best=0,n=a.length();
        int left=0;
        for (int i = 0; i <= a.length()/2; i++) {
            if(a.charAt(i)==a.charAt(n-i-1))
                max++;
            else {
                max = 0;
                left = i+1;
            }
            best=Math.max(best,max);
        }
        System.out.println(best);
        return "";

    }
    public static void main(String[] args) {
        String a = "nitin";
        lps(a);
    }
}
