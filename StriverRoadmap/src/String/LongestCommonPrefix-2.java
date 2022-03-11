package String;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str = "abababaabababa";
        int k=6;
        int count=0;
        for (int i = 0; i < Math.min(k+1,str.length()-k-1); i++) {
            if(str.charAt(i)==str.charAt(i+k+1)){
                count++;
            }
            else
                break;
        }
        System.out.println(count);
    }
}
