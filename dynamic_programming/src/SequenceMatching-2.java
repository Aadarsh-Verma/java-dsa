import java.util.*;

public class SequenceMatching {
    public static void main(String[] args) {
        String a="xyzfgh";
        String b="xsdfjhynbhturizdf";
        int i=0;
        boolean notfound = true;
        boolean ismatching = true;
        while(i<a.length()){
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i)==b.charAt(j)){
                    i++;
                    break;
                }
                else if(j==b.length()-1) {
                    if(notfound)
                        ismatching=false;
                }
            }
            notfound=true;
            if(!ismatching)
                break;
        }
        System.out.println(ismatching);
    }
}
