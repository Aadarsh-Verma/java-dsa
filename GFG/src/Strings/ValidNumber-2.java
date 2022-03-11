package Strings;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class ValidNumber {
    public int isNumber(final String A) {
        String str = A.trim();
        if(str.charAt(0)=='.')
            str = str.substring(1);
        if(str.charAt(0)=='e' || str.charAt(str.length()-1)=='e')
            return 0;
        boolean isnumber = true;
        boolean exp = false;
        boolean isdot = false;
        int cnt_dot=0,cnt_exp = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='e') {
                exp = true;
                cnt_exp++;
            }

            if(str.charAt(i)=='.') {
                isdot = true;
                cnt_dot++;
            }

            if(str.charAt(i)=='.') {
                cnt_dot++;
                if (exp || i == str.length() - 1)
                    isnumber = false;
            }

        }
        if(cnt_dot>1 || cnt_exp>1)
            isnumber = false;
        if(isnumber)
            try{
                isnumber = false;
                BigInteger big = new BigInteger(str);
                isnumber = true;
            }catch (Exception e){
                if(isdot && exp){
                    String[] temp = str.split("\\.");
                    if(temp.length==2){
                        String[] temp2 = str.split("e");
                        if(temp2.length==2){
                            try{
                                BigInteger bg = new BigInteger(temp2[1]);
                                isnumber = true;
                            }catch (Exception ignored){

                            }
                        }
                    }
                }
                if(isdot){
                    String temp[] = str.split("\\.");
                    try {
                        BigInteger first = new BigInteger(temp[0]);
                        BigInteger last = new BigInteger(temp[1]);
                        BigInteger zero = BigInteger.ZERO;
                        if(last.compareTo(zero)<0)
                            isnumber=false;
                    }
                    catch (Exception ex){}
                }
                if(exp){
                    String[] temp = str.split("e");

                }

            }
        return 0;
    }
    public static void main(String[] args) {

    }
}
