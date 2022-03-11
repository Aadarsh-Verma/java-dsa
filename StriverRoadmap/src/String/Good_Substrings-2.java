package String;

import java.util.*;

public class Good_Substrings {

    static int isGoodSubstring(String str,String test,int k){
        int temp=0;
        for (int i = 0; i < str.length(); i++) {
            if(test.charAt(str.charAt(i)-'a')=='0')
                temp++;
            if(temp>k) {
                return 0;

            }
        }
        return 1;
    }
    static void test(String test,String str,int k){
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length()-i; j++) {
                String substring = str.substring(j, j + i);
                    hashSet.add(substring);
            }
        }
        int ans=0;
        Iterator<String> itr = hashSet.iterator();
//        System.out.println(hashSet);
        while(itr.hasNext()){
            ans+=isGoodSubstring(itr.next(),test,k);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String test = sc.next();
        int k = sc.nextInt();
        test(test,str,k);

    }
}
