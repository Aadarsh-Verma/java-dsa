package Strings;

import java.util.*;
import java.io.*;

public class LongestSubstringwithDistictCharacters {
    public static void main(String[] args) {
        String str = "abcadbd";
        int left = 0, right = 0, best = 1;
        HashSet<Character> hash = new HashSet<>();
        hash.add(str.charAt(left));
        for (int i = 1; i < str.length(); i++) {
            if (hash.contains(str.charAt(i))) {
                while (str.charAt(left) != str.charAt(i)) {
                    hash.remove(str.charAt(left));
                    left++;
                }
                left++;

            } else {
                hash.add(str.charAt(i));
            }
            best = Math.max(best, i - left + 1);
        }
        System.out.println(best);

    }
}
