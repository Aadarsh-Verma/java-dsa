package StackNQueue;

import java.util.*;

public class LongestRegularBracketSequence_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int open=0,close=0,best=0,recent_count=0,best_count=0;
        if(str.charAt(0)=='{')
            open++;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)=='{'&&str.charAt(i-1)!='}')
                open++;
            else if(str.charAt(i)=='{'&&str.charAt(i-1)=='}'){
                open=1;
                recent_count=0;
            }
            if(str.charAt(i)=='}'&&open>0){
                recent_count+=2;
                open--;
            }
            best = Math.max(best,recent_count);
        }
    }
}
