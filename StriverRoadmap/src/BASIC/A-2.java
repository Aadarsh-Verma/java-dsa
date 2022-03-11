package BASIC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			ArrayList<Integer> list=new ArrayList<>();
			for (int i = n-1; i >0; i--) {
				for (int j = i-1; j >-1 ; j--) {
					list.add(arr[i]-arr[j]);
				}
			}
			Collections.sort(list,Collections.reverseOrder());
//			System.out.println(list);
			System.out.println(list.get(1));
		}
	}

}
