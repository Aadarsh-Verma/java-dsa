package searching_sorting;

public class square_root {
    public static void main(String[] args) {
        int n = 102;
        int low = 0;
        int high = n;
        int ans = 0;
        int mid=0;
        while(low<=high){
            mid = (low+high)/2;
            if(Math.abs(mid*mid-n)==0){
                System.out.println("equals: "+mid);
                ans = mid;
                break;
            }
            if(mid*mid>n)
                high = mid-1;
            else {
                ans = mid;
                low = mid + 1;
            }System.out.println("MID is "+mid);
        }
        System.out.println(ans);
    }
}
