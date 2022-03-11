public class subset_sum {


    static int subset(int[] arr,int n,int sum){
        if(n==0&&sum!=0) return  0;
        else if(sum==0) return 1;
        else if(arr[n-1]<=sum){
            int c1=subset(arr,n-1,sum-arr[n-1]);
            int c2=subset(arr,n-1,sum);
            return c1+c2;
        }
        else{
            return subset(arr,n-1,sum);
        }
    }
    public static void main(String[] args) {
           int[] arr={1,3,2,5,6,7};
           int sum=12;
           System.out.println(subset(arr,arr.length,sum));
    }
}
