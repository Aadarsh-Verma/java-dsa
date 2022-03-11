package DynamicProgramming;
import java.util.*;

public class MaxPrdSubArray {
    public static void main(String[] args) {
        int[] arr={6, -3, -10, 0, 2,5,6,22};
        int n = arr.length;
        int min_val = arr[0];
        int max_val = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < n; i++)
        {
            if (arr[i] < 0)
            {
                int temp = max_val;
                max_val = min_val;
                min_val =temp;

            }
            max_val = Math.max(arr[i], max_val * arr[i]);
            min_val = Math.min(arr[i], min_val * arr[i]);

            maxProduct = Math.max(maxProduct, max_val);
        }
        System.out.println(maxProduct);
    }
}
