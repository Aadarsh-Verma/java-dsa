package Strings;

import java.util.*;
import java.io.*;

public class MultiplyStrings {
    static int intVal(char ch) {
        return (int) ch - 48;
    }

    static String multiply(String str, char ch) {
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        for (int i = str.length() - 1; i > -1; i--) {
            int temp = intVal(ch) * intVal(str.charAt(i)) + carry;
            carry = temp / 10;
            sb.append(temp % 10);
        }
        if (carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
    }

    static String add(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        int n = a.length(), m = b.length(), i = n - 1, j = m - 1;
        int carry = 0;
        while(i>-1 && j>-1){
            int temp = carry + intVal(a.charAt(i)) + intVal(b.charAt(j));
            sb.append(temp%10);
            carry = temp/10;
            i--; j--;
        }
        while(i>-1){
            int temp = carry + intVal(a.charAt(i));
            sb.append(temp%10);
            carry = temp/10;
            i--;
        }
        while(j>-1){
            int temp = carry + intVal(b.charAt(j));
            sb.append(temp%10);
            carry = temp/10;
            j--;
        }
        if(carry>0)
            sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "19876";
        String b = "0";
        StringBuilder zero = new StringBuilder("");
        String ans = "0";
        for (int i = b.length()-1; i >-1 ; i--) {
            String temp = multiply(a,b.charAt(i)) + zero.toString();
            zero.append(0);
            ans = add(ans,temp);
        }
        System.out.println(ans);
    }
}
