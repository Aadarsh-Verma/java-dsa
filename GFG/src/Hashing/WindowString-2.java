package Hashing;

import java.util.*;
import java.io.*;

public class WindowString {
    public String minWindow(String A, String B) {
        HashSet<Character> hash = new HashSet<>();
        HashSet<Character> buffer = new HashSet<>();
        for (int i = 0; i < B.length(); i++) {
            hash.add(B.charAt(i));
        }
        int left = -1,min = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if(hash.contains(ch)){
                if(left!=-1 && A.charAt(left)==ch){
                    System.out.println("executed left move at "+i);
                    left++;
                    while(left<A.length() && !hash.contains(A.charAt(left)))
                        left++;
                }
                if(left!=-1 && A.charAt(left)==ch && buffer.size()==1)
                    left = i;
                if(left==-1)
                    left = i;
                buffer.add(ch);
                System.out.println("buffer is "+buffer+" "+left+" "+i);
                if(buffer.size()==B.length()){
                    if(i-left<min){
                        min = i-left;
                        ans = A.substring(left,i+1);
                    }
                    buffer.remove(A.charAt(left));
                    left++;
                    while(left<A.length() && !hash.contains(A.charAt(left)))
                        left++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new WindowString().minWindow("babdbxbayc","abc"));
    }
}
