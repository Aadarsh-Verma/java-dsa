import java.util.*;
import java.io.*;

public class QuestionString {
    static int rec(StringBuilder str, int n) {
        if (n == 0)
            return 0;
        int res = 0;
        if (str.charAt(n - 1) != '?')
            return rec(str, n - 1);
        for (int i = 0; i < 26; i++) {
//            System.out.print(" index " + i);
            char curr = (char) (97 + i);
//            System.out.print(curr + " ");
//            System.out.println("res called for n " + (n) + " for char " + curr + " and index " + i);
            if (n < str.length() && str.charAt(n - 1) == '?' && curr != str.charAt(n)) {
                if (n > 1 && str.charAt(n - 2) == curr) {
                    continue;
                }

                str.replace(n - 1, n, Character.toString(curr));
                res += rec(str, n - 1) + 1;
                str.replace(n - 1, n, Character.toString('?'));
            } else {
//                System.out.println("skipping character " + curr);
            }
        }

//        rec(str,n-1);
        return res;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("a?b?dxa");
        System.out.println(rec(str, str.length() - 1));
    }
}
