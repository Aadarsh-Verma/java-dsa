package String;

import java.util.*;
import java.io.*;
public class LCP_Pivot_8 {
    static class FastReader
        {
            BufferedReader br;
            StringTokenizer st;

            public FastReader()
            {
                br = new BufferedReader(new
                         InputStreamReader(System.in));
            }

            String next()
            {
                while (st == null || !st.hasMoreElements())
                {
                    try
                    {
                        st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException  e)
                    {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt()
            {
                return Integer.parseInt(next());
            }

            long nextLong()
            {
                return Long.parseLong(next());
            }

            double nextDouble()
            {
                return Double.parseDouble(next());
            }

            String nextLine()
            {
                String str = "";
                try
                {
                    str = br.readLine();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                return str;
            }
        }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String str = fr.next();
        int n=fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=fr.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x=arr[i];
            int high=Math.min(x,str.length()-x);
            int count=0;
            for (int j = 0; j < high; j++) {
                if(str.charAt(j)==str.charAt(x+j))
                    count++;
                else
                    break;
            }
            System.out.println(count);
        }
    }
}
