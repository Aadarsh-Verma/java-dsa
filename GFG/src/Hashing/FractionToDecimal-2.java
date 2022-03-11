package Hashing;

import java.util.*;
import java.io.*;

public class FractionToDecimal {
    public String fractionToDecimal(int A, int B) {
        StringBuilder sb = new StringBuilder("");
        if(A==0)
            return "0";
        if(A==Integer.MIN_VALUE)
            return "2147483648";
        boolean isNegative = false;
        if(A<0 && B>0 || A>0 && B<0)
            isNegative = true;

        int num = A/B;
        if(A%B==0){
            sb.append(A/B);
        }
        else{
            sb.append(num);
            sb.append('.');
            num = A%B;

            HashSet<Integer> hash = new HashSet<>();
            int quotient;
            while (true){
                if(num<B) {
                    quotient = num * 10 / B;
                    num = (num*10) %B;

                }
                else {
                    quotient = num / B;
                    num = num%B;
                }
                if(hash.contains(quotient)){
                    if((sb.charAt(sb.length()-1)-'0')==quotient){
                        sb.deleteCharAt(sb.length()-1);
                        sb.append('(');
                        sb.append(quotient);
                        sb.append(')');
                    }
                    break;
                }
                sb.append(quotient);
                hash.add(quotient);
            }
        }
        if(isNegative){
            return '-'+sb.toString();
        }
        return sb.toString();
    }    public static void main(String[] args) {
        System.out.println(new FractionToDecimal().fractionToDecimal(-1,2));
    }
}
