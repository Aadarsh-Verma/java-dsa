package BIT;

import java.util.*;
import java.io.*;

public class Check_Kth_Bit {
    public static void main(String[] args) {
        int n = 222, k = 2;
        //Method 1 Using Right Shift
        /* We will right shift the no and and with 1*/
        // if 1 then bit is set if 0 then bit is not set
        int rans = (n>>k)&1;
        //Method 2 left shift 1 k-1 times and and with n
        // IMP => if 0 then bit not set else then bit is set
        int lans = ((1<<(k-1))&n);
    }
}
