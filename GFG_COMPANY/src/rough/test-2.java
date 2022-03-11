package rough;

import java.util.*;
import java.io.*;

public class test {
    static long gcd(long a, long b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

    long A(long x){
        long ans = 0L;
        for (int i = 1; i < x+1; i++) {
            if(gcd(i,x)!=1)
                ans++;
        }
        return ans;
    }
    long B(long d){
        return 0;
    }
    public static void main(String[] args) {

    }
}
