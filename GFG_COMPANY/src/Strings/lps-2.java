package Strings;

import java.util.*;
import java.io.*;

public class lps {

    public static void main(String[] args) {
        String str = "helloohell";
        int n = str.length();
        int[] arr = new int[str.length()];
        int i = 1 , len = 0;
        arr[0] = 0;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                arr[i] = len;
                i++;
            }
            else{
                if(len>0){
                    len = arr[len-1];
                }
                else{
                    arr[i] = 0;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
