package BIT;

import java.util.*;
import java.io.*;

public class msb_no {
    static int maxXORInRange(int L, int R)
    {
        // get xor of limits
        int LXR = L ^ R;

        //  loop to get msb position of L^R
        int msbPos = 0;
        while (LXR > 0)
        {
            msbPos++;
            LXR >>= 1;
        }
        System.out.println(msbPos);
        // construct result by adding 1,
        // msbPos times
        int maxXOR = 0;
        int two = 1;
        while (msbPos-- >0)
        {
            maxXOR += two;
            two <<= 1;
        }

        return maxXOR;
    }
    public static void main(String[] args) {
        int n = 5;
        int num = 0;
        while(n-->0){
            num += 1;
            num <<= 1;
        }

        System.out.println(num);
        System.out.println(maxXORInRange(16,20));
    }
}
