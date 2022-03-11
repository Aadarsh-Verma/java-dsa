import java.util.Arrays;

public class mcm {
    static int mcm(int[] arr,int i,int j){
        if(i==j) return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int c1=mcm(arr,i,k)+mcm(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min=Math.min(c1,min);
        }
        return min;
    }
    static int[][] t=new int[7][7];     

    static int mcmLoop(int[] arr,int i,int j){
        if(i==j) return 0;
        if(t[i][j]!=0) return t[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int c1=mcm(arr,i,k)+mcm(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min=Math.min(c1,min);
        }
         t[i][j]=min;
        return t[i][j];
    }
    static void print(){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                System.out.print(t[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 30};
        System.out.println(mcm(arr,1,4));
        print();
    }
}
