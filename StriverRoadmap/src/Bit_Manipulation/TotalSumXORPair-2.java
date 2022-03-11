package Bit_Manipulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class TotalSumXORPair {
    /* Given an array of integers Find the XOR pair sum  arr=[5,3,9]
        5 ^ 3 = 0 1 1 0
        5 ^ 9 = 1 1 0 0
        3 ^ 9 = 1 0 1 0   sum = 28
        in bit level can be done by 0(2^^0)+2(2^^1)+2(2^^2)+2(2^^3) gen: no of ones * 2^^i
        Algo :
        Find the number of ith set bit(x) and unset bit(y)
        result += x*y*2^^i
     */
    public static void main(String[] args) {
        int[] arr={5,3,9};
        int result=0;
        for (int i = 0; i < 32; i++) {
            int count_zero = 0, count_one=0;
            for (int j = 0; j < arr.length; j++) {
                if(((arr[j])&(1 << i))==0)
                    count_one++;
                else
                    count_zero++;
            }
            result += count_one*count_zero*(1<<i);
        }
        System.out.println(result);
    }

}
