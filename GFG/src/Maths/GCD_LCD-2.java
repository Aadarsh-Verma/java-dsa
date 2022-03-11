package Maths;

import java.util.*;
import java.io.*;

public class GCD_LCD {
    static int gcd(int a , int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a= 10000, b = 1005;
        int gcd = gcd(a,b);
        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+(b/gcd*a));
    }
}
