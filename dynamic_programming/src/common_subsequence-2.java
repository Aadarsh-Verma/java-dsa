import java.util.*;

public class common_subsequence {
    static boolean isPalindrome(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    static String common(String a,String b,int n,int m){
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0) t[i][j]=0;
                else if(a.charAt(i-1)==b.charAt(j-1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];

                }
                else{
//                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                    t[i][j]=0;
                }
            }
        }
        int maxi = 0,maxj=0;
        int max = t[0][0];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if(t[i][j]>max) {
                    max = t[i][j];
                    maxi=i;
                    maxj=j;
                }
            }
        }
        int i=maxi,j=maxj;
        ArrayList<Character> list=new ArrayList<>();
        while(t[i][j]!=0){
            list.add(a.charAt(i-1));
            i--;
            j--;
        }

        Collections.reverse(list);
//        for(int[] row : t)
//            System.out.println(Arrays.toString(row));
        String str = "";
        for (int k = 0; k < list.size(); k++) {
            str+=list.get(k);
        }
        if(isPalindrome(str))
        return str;
        else{
            String at = str;
            String bt = new StringBuilder(at).reverse().toString();

            return common(at,bt,at.length(),bt.length());
        }
    }
    static HashSet<Character> h=new HashSet<>();
    static int subsequence(String a,String b,int n,int m){
        if(n==0||m==0) return 0;
        else if(a.charAt(n-1)==b.charAt(m-1)) {
            h.add(a.charAt(n-1));
            return 1 + subsequence(a, b, n - 1, m - 1);
        }
        else{
            return Math.max(subsequence(a,b,n-1,m),subsequence(a,b,n,m-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = new StringBuilder(a).reverse().toString();

        System.out.println(common(a,b,a.length(),b.length()));
        //System.out.println(subsequence(a,b,a.length(),b.length()));
        //System.out.println(h);

    }
}
