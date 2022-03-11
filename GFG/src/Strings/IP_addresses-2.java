package Strings;

import java.util.*;
import java.io.*;

public class IP_addresses {
    boolean isZeroValid(String str){
        return str.charAt(0) != '0' || str.length() == 1;
    }
    String ip(String a,String b,String c,String d){
        boolean isValid = true;
        if(a.length()>3 ||b.length()>3 ||c.length()>3 ||d.length()>3)
            return "";
        int x1 = 0,x2=0,x3=0,x4=0;
        try {
             x1 = Integer.parseInt(a);
             x2 = Integer.parseInt(b);
             x3 = Integer.parseInt(c);
             x4 = Integer.parseInt(d);
        }catch (Exception e){
            System.out.println("exc");
            return "";
        }
        if(x1>255 || x2>255 || x3>255 || x4>255)
            isValid = false;
        if(!isZeroValid(a)) isValid = false;
        if(!isZeroValid(b)) isValid = false;
        if(!isZeroValid(c)) isValid = false;
        if(!isZeroValid(d)) isValid = false;
        String ans = a+"."+b+"."+c+"."+d;
        return (isValid)? ans: "";

    }
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> ans = new ArrayList<String>();
        int n = A.length();
        if(A.length()<4)
            return ans;
        if(A.length()==4) {
            ans.add(A.charAt(0) + "." + A.charAt(1) + "." + A.charAt(2) + "." + A.charAt(3));
            return ans;
        }
        int first = 0;
        for(int i=first;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    String a = A.substring(0,i+1);
                    String b = A.substring(i+1,j+1);
                    String c = A.substring(j+1,k+1);
                    String d = A.substring(k+1);
//                    System.out.println(a+" "+b+" "+c+" "+d+" ");
                    String temp = ip(a,b,c,d);
                    if(temp.length()!=0)
                        ans.add(temp);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new IP_addresses().restoreIpAddresses("0100100"));
        System.out.println(new IP_addresses().isZeroValid("01"));
    }
}
