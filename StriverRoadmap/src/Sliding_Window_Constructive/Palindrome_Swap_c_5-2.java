package Sliding_Window_Constructive;

import java.util.*;

public class Palindrome_Swap_c_5 {
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        String str = sc.next();
        char[] a = str.toCharArray();
        int swaps = 0;
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (a[i] == a[n - i - 1])
                continue;
            if (a[i] != a[n - i - 1]) {
                if (a[i + 1] == a[n - i - 1]) {
                    swap(a, i, i + 1);
                    swaps++;
                } else if (a[n - i - 2] == a[i]) {
                    swap(a, n - i - 1, n - i - 2);
                    swaps++;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        isPalindrome=true;
        for (int i = 0; i < n / 2 - 1; i++) {
            if(a[i]!=a[n-i-1])
                isPalindrome=false;
        }
        if (isPalindrome) {
            System.out.println("YES");
            System.out.println(swaps);
        } else
            System.out.println("NO");

    }
}
