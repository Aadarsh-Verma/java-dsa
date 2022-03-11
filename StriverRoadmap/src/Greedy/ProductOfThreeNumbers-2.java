package Greedy;

import java.util.*;

public class ProductOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            int a = -1, b = -1, c = -1;
            boolean productExists = false;
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0 && i != num / i) {
                    for (int j = i + 1; j * j < num; j++) {
                        if ((num / i) % j == 0 && j != i && j != num / i) {
                            productExists = true;
                            a = i;
                            b = (num / i) / j;
                            c = j;
                            break;
                        }
                    }
                    if (productExists)
                        break;
                }
            }
            if (productExists&&a!=b&&b!=c) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);

            } else
                System.out.println("NO");
        }
    }
}
