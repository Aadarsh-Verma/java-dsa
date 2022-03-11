package Sliding_Window_Constructive;

import java.util.*;

public class StringSwapping_c_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String at = sc.next();
        String bt = sc.next();
        char[] a =at.toCharArray();
        char[] b = bt.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(a.length+":"+b.length);
        for (int i = 0; i < n; i++) {
            if(a[i]!=b[i]){
                int index = 0;
                for (int j = 0; j < n; j++) {
                      if(a[j]!=b[j]&&b[j]!=a[i]) {
                          index = j;
                          break;
                      }
                }
                System.out.println(i+"=>"+index);
                System.out.println(Arrays.toString(a));
                System.out.println(Arrays.toString(b));
                list.add(i);
                list.add(index);
                char temp = a[i];
                a[i]=b[index];
                b[index]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(Arrays.equals(a,b)){
            System.out.println(list.size()/2);
            for (int i = 0; i < list.size(); i++) {
                if(i!=0&&i%2==0)
                    System.out.println();
                System.out.print(list.get(i)+1+" ");
            }
        }
        else
            System.out.println(-1);
    }
}
