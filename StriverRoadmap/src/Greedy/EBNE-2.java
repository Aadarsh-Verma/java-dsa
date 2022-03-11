package Greedy;

import java.util.*;

public class EBNE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            char[] a = str.toCharArray();
            int[] arr = new int[n];
            for (int i = 0; i < a.length; i++) {
                arr[i] = Character.getNumericValue(a[i]);
            }
            ArrayList<Integer> list = new ArrayList<>();
            int count=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]%2==1){
                    list.add(arr[i]);
                    count++;
                }
                if(count==2)
                    break;
            }

            if(count!=2)
                System.out.println(-1);
            else {

                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if(i==list.size()-1)
                        System.out.println();
                }
            }

        }


    }
}
