package Maths;

import java.util.*;
import java.io.*;

public class digit_count {
    public static void main(String[] args) {
        int n = 567834521;
        int sum = 0;
        int count = 0;
        while(n>0){
            sum+=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
