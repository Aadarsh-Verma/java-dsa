package Tree;
import java.util.*;

public class Tree {
    int data;
    Tree root;
    Tree left = null,right = null;
    Tree(){}

    Tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    Tree insertUtil(Tree root,int data){
        if(root==null){
            root = new Tree(data);
        }
        else if(data>root.data)
            root.right = insertUtil(root.right,data);
        else if(data<=root.data)
            root.left = insertUtil(root.left,data);
        return root;
    }
    Tree insert(int data){
        if(root==null){
            root=new Tree(data);
        }
        else if(root.data>=data)
            root.left=insertUtil(root.left,data);
        else root.right=insertUtil(root.right,data);
        return root;
    }
    void printTree(){
        LinkedList<Tree> ll=new LinkedList<>();
        ll.add(this.root);
        while (!ll.isEmpty()){
            Tree temp = ll.removeFirst();
            System.out.println(temp.data);
            if(temp.left!=null)
                ll.add(temp.left);
            if(temp.right!=null)
                ll.add(temp.right);
        }
    }
    void getSampleTree(){
        insert(11);
        insert(5);
        insert(4);
        insert(3);
        insert(7);
        insert(8);
        insert(6);
        insert(15);
        insert(13);
        insert(12);
        insert(14);
        insert(19);
        insert(16);
        insert(21);
    }
    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.getSampleTree();
        tr.printTree();
    }
}
