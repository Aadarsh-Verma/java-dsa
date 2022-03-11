import java.util.*;

class rough{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            str[i] = str[i].toLowerCase();
        }
        boolean isStrong = true;
        for (int i = 0; i < n && isStrong; i++) {
            char[] temp = str[i].toCharArray();
            int[] x = new int[temp.length];
            for (int j = 0; j < temp.length; j++) {
                x[j] = (int)temp[j];
            }

            for (int j = 0; j < x.length-3; j++) {
                if(x[j]+1==x[j+1] && x[j+1]+1==x[j+2]) {
                    isStrong = false;
                    break;
                }
            }
            
        }
        if(isStrong)
            System.out.println("strong");
        else
            System.out.println("weak");
    }
}