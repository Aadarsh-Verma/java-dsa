package Maths;

import java.util.*;
import java.io.*;

public class IterativeExponentiation {
    public static void main(String[] args) {
        int n = 5;
        int x = 5;
        int res = n;
        int ans = 1;
        while(x>0){
            if(x%2==0){

            }else{
                ans*=res;
            }
            x= x/2;
            res = res*res;
        }
        System.out.println(ans);
    }
}
