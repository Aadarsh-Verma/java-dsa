package Sliding_Window_Constructive;

import java.util.*;

public class swap_sort_c_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int min = index;
            for (int j = index; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != index) {
                list.add(min);
                list.add(index);
                swaps++;
            }
            int temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;
            index++;
        }
        System.out.println(swaps);
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0&&i!=0)
                System.out.println();
            System.out.print(list.get(i)+" ");
        }
    }
}
