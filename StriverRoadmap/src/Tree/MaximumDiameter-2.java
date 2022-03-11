package Tree;

import java.util.*;

public class MaximumDiameter {
    static int result = Integer.MIN_VALUE;
    static int maximum_diameter(Tree root){
        if(root==null)
            return 0;
        int left = maximum_diameter(root.left);
        int right = maximum_diameter(root.right);
        int diameter = left+right+1;

        result = Math.max(result,diameter);
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.getSampleTree();
        tr.printTree();
        System.out.println("fn output:"+maximum_diameter(tr.root));
        System.out.println("result_value:"+result);
    }
}
