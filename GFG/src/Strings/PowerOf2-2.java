package Strings;

import java.util.*;
import java.io.*;

public class PowerOf2 {
    static int val(char ch) {
        return (int) ch - 48;
    }

    public static void main(String[] args) {
        String str = "147573952589676412928";
        StringBuilder prev = new StringBuilder(str);
        do {
            StringBuilder sb = new StringBuilder("");
            int carry = 0;
            for (int i = 0; i < prev.length(); i++) {
                int val = val(prev.charAt(i)) + carry;
                if(val>=10)
                    carry = 0;
                if(i>0 && prev.charAt(i)=='0' && prev.charAt(i-1)=='1'){
                    sb.append(0);
                    sb.append(5);
                }
                else if (val == 0) {
                    sb.append(0);
                } else if (val != 1) {
                    sb.append(val / 2);
                    if (val % 2 != 0)
                        carry = 10;
                } else {
                    carry = 10;
                }
            }
            System.out.println(sb.toString());
            prev = sb;
        } while (prev.length() > 1);
        System.out.println(prev.toString());

    }
}
