package Sliding_Window_Constructive;

import java.util.*;

public class display_board_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            int power = 0;
            for (int i = 1; i <= n - k; i++) {
                for (int j = i; j < i + k; j++) {
                    if (str.charAt(j) != str.charAt(j - 1))
                        power++;
                }
            }
            System.out.println(power);
        }
    }

}
