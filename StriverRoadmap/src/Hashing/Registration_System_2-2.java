package Hashing;

import java.util.*;

public class Registration_System_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = sc.next();
        }
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            if(!map.containsKey(str[i])) {
                map.put(str[i],0);
                System.out.println("OK");
            }
            else {
                int temp=map.get(str[i])+1;
                String newStr = str[i]+temp;
                System.out.println(newStr);
                map.put(str[i],temp);
            }
        }

    }
}
