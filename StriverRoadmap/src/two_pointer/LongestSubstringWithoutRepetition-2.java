package two_pointer;

import java.util.*;

public class LongestSubstringWithoutRepetition {
    public static void main(String[] args) {
        String s = "dfdv";
        int max=0,left=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,s.charAt(i));
            }
            max = Math.max(max,i-left+1);
            map.put(s.charAt(i),i+1);

        }
        System.out.println(max);
    }
}
