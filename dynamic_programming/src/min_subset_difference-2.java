import java.util.Collections;

public class min_subset_difference {
    static int subset(int[] arr,int n,int arraySum,int calculatedSum){
        if(n==0) return Math.abs(2*calculatedSum-arraySum);

        return Math.min(subset(arr,n-1,arraySum,calculatedSum),subset(arr,
                n-1,arraySum,calculatedSum+arr[n-1]));
    }

    public static void main(String[] args) {
        int[] arr={2,4,3,6,7,8};
        System.out.println(subset(arr,arr.length, 30,0));
    }
}
