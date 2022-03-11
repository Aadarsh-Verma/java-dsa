import java.util.Arrays;

public class zero_one_knapsack {


    static int kanpsack(int[] val, int[] weight, int n, int w){
        if(n==0||w==0)
            return 0;
        else if(w>=weight[n-1]){
            int c1=val[n-1]+kanpsack(val,weight,n-1,w-weight[n-1]);
            int c2=kanpsack(val,weight,n-1,w);
            return Math.max(c1,c2);
        }
        else{
            return kanpsack(val,weight,n-1,w);
        }
    }

    static int loop(int[] val,int[] weight,int n,int w){
        int[][] t=new int[n+1][w+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0||j==0) t[i][j]=0;
                else if(j>=weight[i-1]){
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-weight[i-1]],t[i-1][j]);
                }
                else t[i][j]=t[i-1][j];
            }
        }
        for(int[] row:t)
            System.out.println(Arrays.toString(row));
        return t[n][w];
    }
    public static void main(String[] args) {
        int[] value=new int[] {20,100,30,50};
        int[] weight=new int[]{1,2,3,4};
        int capacity=6;
        System.out.println(kanpsack(value,weight,value.length,capacity));
        System.out.println(loop(value,weight,value.length,capacity));
    }
}
