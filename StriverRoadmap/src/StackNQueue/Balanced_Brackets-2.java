package StackNQueue;

import java.util.*;

public class Balanced_Brackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        	String str = sc.next();
        	Stack<Character> st=new Stack<>();
            boolean isBalanced=true;
        	for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
                    st.push(str.charAt(i));
                if(str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')'){
                    if(st.isEmpty()){
                        isBalanced=false;
                        break;
                    }
                    char top = st.peek();
                    if(str.charAt(i)=='}'&&top!='{'){
                        isBalanced=false;
                        break;
                    }
                    if(str.charAt(i)==']'&&top!='['){
                        isBalanced=false;
                        break;
                    }
                    if(str.charAt(i)==')'&&top!='('){
                        isBalanced=false;
                        break;
                    }
                    st.pop();
                }
            }
        	if(st.isEmpty()&&isBalanced)
                System.out.println("YES");
        	else{
                System.out.println("NO");
            }

        }
    }
}
