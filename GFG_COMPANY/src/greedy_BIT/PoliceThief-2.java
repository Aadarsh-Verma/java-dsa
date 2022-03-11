package greedy_BIT;

import java.util.*;

public class PoliceThief {
    static int len;

    static int catchThieves(char arr[], int n, int k, int[] thief) {
        // Code here
        int left = 0;
//        System.out.println(len);
        while (left < n && arr[left] != 'T')
            left++;
        if (left == n)
            return 0;
        int ans = 0;
        for (int i = 0; i < n && left < n; i++) {
            if (arr[i] == 'P') {
                if (Math.abs(i - left) <= k) {
                    ans++;
                    System.out.println("Police :" + i + "=> Thief :" + left);
                    thief[left] = 2;
                    left++;

                    while (left < n && arr[left] != 'T')
                        left++;
                    System.out.println("next left at :" + left);
                }
                else if(i>left){
                    System.out.println("looking for next thief");
                    while(left<n) {
                        System.out.println("left "+left);
                        if(Math.abs(left-i)<=k && arr[left]=='T')
                            break;
                        if(left>i && arr[left]=='T')
                            break;
                        left++;
                    }
                    i--;
                }

            }

        }
        return ans;
    }

    public static void main(String[] args) {

//        String str = "T P P P T T P T P T P P T T P T T P P P P P T T P T P T T T P P P P T T P T P T P T T P T P T T P T T T T T T T P P T P T P T P P T T P P T T T T T T T T T T P T P P P P T P T T";
        String str = "P P P P P T T P T T T T T T P P";
        HashMap<Integer,Character> map = new HashMap<>();
        String[] temp = str.split(" ");
        for(int i=0;i<temp.length;i++){
            map.put(i,temp[i].charAt(0));
        }
        System.out.println(map);
        int k = 2;

        String[] split = str.split(" ");
        char[] chars = new char[split.length];
        len = split.length;
        for (int i = 0; i < split.length; i++) {
            chars[i] = split[i].charAt(0);
        }
        int[] thief = new int[split.length];
        Arrays.fill(thief, -1);
        System.out.println(catchThieves(chars, chars.length, k, thief));
        System.out.println(Arrays.toString(thief));
    }
}
