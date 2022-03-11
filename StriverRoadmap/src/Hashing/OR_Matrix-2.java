package Hashing;

import java.util.*;

public class OR_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j]=-1;
            }
        }
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        boolean isOR = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1&&row.contains(i)&&col.contains(j)){
                    isOR = false;
                    break;
                }
                else if(arr[i][j]==1&&ans[i][j]==-1)
                    ans[i][j]=1;
                else if(arr[i][j]==0){

                    set(ans,i,j);
//                    System.out.println("set"+i+":"+j);
//                    show(ans);
                }
            }
            if (!isOR)
                break;
        }

        if (!isOR)
            System.out.println("NO");
        else {
            System.out.println("YES");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
        //Debug


    }//main
    static void set(int[][] ans,int m,int n){
        for (int i = 0; i < ans[m].length; i++) {
            ans[m][i]=0;
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i][n]=0;
        }
    }

    static void show(int[][] temp){
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
