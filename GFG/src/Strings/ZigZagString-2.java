package Strings;

import java.util.*;
import java.io.*;

public class ZigZagString {
    public static void main(String[] args) {
        String str = "paypalishiring"; int row = 2;
        StringBuilder sb = new StringBuilder("");
        int n = str.length();
        for (int i = 0; i < row; i++) {
            int ra = i , rb = row - i - 1;
            int b_index = 2*rb, a_index = 2*ra;
            if(ra!=0 && rb!=0){
                int start = i,cnt = 1;
                while(start<n){
                    sb.append(str.charAt(start));
                    if(cnt%2!=0){
                        start+=b_index;
                    }
                    else
                        start += a_index;
                    cnt++;
                }
            }
            else if(ra==0){
                int start = i;
                while(start<n){
                    sb.append(str.charAt(start));
                    start+=b_index;
                }
            }
            else{
                int start = i;
                while(start<n){
                    sb.append(str.charAt(start));
                    start+=a_index;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
