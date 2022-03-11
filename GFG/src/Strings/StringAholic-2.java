package Strings;

import java.util.*;
import java.io.*;

public class StringAholic {
    int rotationPeriod(String str) {
        StringBuilder sb = new StringBuilder(str);

        int n = sb.length();

        int i = 0;
        for (i = 0; i < str.length(); i++) {
            char ch = sb.charAt(n - 1);
            sb.deleteCharAt(n - 1);
            sb.insert(0, ch);
            if (sb.toString().compareTo(str) == 0)
                break;
        }
        int k = (i+1)*2;
        int temp = 1;
        while(temp<k){
            if(temp*(temp+1)%k==0)
                break;
            temp++;
        }
        return temp;

    }
    int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    int lcm(int a,int b){
        int gcd = gcd(a,b);
        long a0 = a , b0 = b;
        long x = (a0 / gcd *b0)%1000000007;
        return (int)x;
    }
    public int solve(ArrayList<String> A) {
        ArrayList<Integer> min_time = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            min_time.add(rotationPeriod(A.get(i)));
        }
        int lcm = lcm(min_time.get(0),min_time.get(1));
        if(min_time.size()>2){
            for (int i = 2; i < min_time.size(); i++) {
                lcm = lcm(lcm,min_time.get(i));
            }
        }
        return lcm;
    }

    public static void main(String[] args) {

    }
}
