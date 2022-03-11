public class scrambled_string {
    static boolean scrambled(String a,String b){
        int N=a.length();
        if(a.length()!=b.length()) return false;
        if(a.isEmpty()==b.isEmpty()) return true;
        if(a.equals(b)) return true;
        if(N==0||b.length()==0) return false;

        boolean isScrambled=false;
        for(int i=1;i<N;i++){
            if (scrambled(a.substring(0, i), b.substring(0, i)) &&
                    scrambled(a.substring(i, N), b.substring(i, N)) ) {
                return true;
            }
            if (scrambled(a.substring(0,  i), b.substring(N-i, N))   &&
                    scrambled(a.substring( i, N), b.substring(0, N-i)) ) {
                return true;
            }


        }
          return false;
    }

    public static void main(String[] args) {
        String a="greatt";
        String b="rgatk";
        System.out.println(scrambled(a,b));
    }

}
