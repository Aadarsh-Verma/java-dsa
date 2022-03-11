package graph;

import java.util.*;
import java.io.*;

public class WordLadder_1 {
    boolean compare(String a, String b) {
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            hash.add(a.charAt(i));
        }
        int cnt = 0;
        for (int i = 0; i < b.length(); i++) {
            if (!hash.contains(b.charAt(i)))
                cnt++;
        }
        return cnt == 1;
    }

    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        int ans = 0, n = wordList.length;
        Queue<String> q = new LinkedList<>();
        q.add(startWord);

        boolean[] visited = new boolean[n];

        while (!q.isEmpty()) {
            ans++;
            System.out.println(q);
            int q_size = q.size();
            for (int j = 0; j < q_size; j++) {
                String curr = q.remove();
                if (curr.compareTo(targetWord) == 0) {

                    return ans + 1;
                }
                for (int i = 0; i < n; i++) {

                    if (!visited[i] && compare(curr, wordList[i])) {

                        q.add(wordList[i]);
                        visited[i] = true;
                    }
                }
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        String[] words = new String[]{"des","der","dfr","dgt","dfs"};
        String start = "der";
        String end = "dfs";
        System.out.println(new WordLadder_1().wordLadderLength(start, end, words));
    }
}
