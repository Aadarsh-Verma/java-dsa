package DynamicProgramming;

import java.util.*;

public class StringAddDelReplace {
    static int func(String a,int n,String b,int m){
        if(n==0)
            return m;
        if(m==0)
            return n;
        if(a.charAt(n-1)==b.charAt(m-1))
            return func(a,n-1,b,m-1);
        else{
            int insert = func(a,n,b,m-1)+1;
            int del = func(a,n-1,b,m)+1;
            int replace = func(a,n-1,b,m-1)+1;
            return Math.min(insert,Math.min(del,replace));
        }
    }
    public static void main(String[] args) {
        String a = "sunday";
        String b = "saturday";
        System.out.println(func(a,a.length(),b,b.length()));

    }
}
/*Given two strings str1 and str2 and below operations that can performed on str1.
Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
Insert
Remove
Replace
*/