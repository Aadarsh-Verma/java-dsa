package StackNQueue;

import java.util.*;

public class DropPackets {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            Stack<Character> st=new Stack<>();
            boolean isDrop = true;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='*'&&st.isEmpty())
                    st.push(str.charAt(i));
                else if(str.charAt(i)=='*'){
                    if(st.peek()=='*')
                        continue;
                    if(st.peek()=='0'){
                        while(st.peek()=='0')
                            st.pop();
                    }
                }
                else if(str.charAt(i)=='0'){
                    if(st.isEmpty()){
                        isDrop=false;
                        break;
                    }
                    if(st.peek()=='*'){
                        st.push('0');
                        continue;
                    }
                    if(st.peek()=='0'){
                        char temp = st.pop();
                        if(st.peek()=='0'){
                            isDrop=false;
                            break;
                        }
                        if(st.peek()=='*'){
                            st.push(temp);
                            st.push(str.charAt(i));
                        }

                    }
                }
            }
            if(isDrop)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
