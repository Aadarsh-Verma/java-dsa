package String;

import java.util.*;

public class password_5 {
    static boolean KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();
//        String ans = "";

        int lps[] = new int[M];
        int j = 0; // index for pat[]
        boolean found=false;
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
//                System.out.println("Found pattern "
//                        + "at index " + (i - j));
//                ans = txt.substring(i-j,i);
                found=true;
                break;
//                System.out.println(ans);
//                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return found;
    }

    static void computeLPSArray(String pat, int M, int lps[])
    {
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else // (pat[i] != pat[len])
            {

                if (len != 0) {
                    len = lps[len - 1];


                }
                else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    static boolean isFeasible(String str,int mid){
        String a = str.substring(0,mid);
        String b = str.substring(str.length()-mid);

        if(a.compareTo(b)==0){
            return KMPSearch(str.substring(0,mid),str.substring(1,str.length()-1));
        }
        else
            return false;
    }
    static String calculate(String str){
       int low = 1;
       int high=str.length()-1;
       String ans="";
       while(high>=1){
           int mid = (low+high)/2;
//           System.out.println(low+":"+mid+":"+high);
//           System.out.println(ans);
           if(isFeasible(str,high)){
               ans=str.substring(0,high);
               high--;
               break;
           }
           else{
               high--;
           }
       }
        return ans;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String str = "abcdabc";
//
        String ans = calculate(str);
        if(ans.length()==0)
            System.out.println("Just a legend");
        else
            System.out.println(ans);

    }
}
