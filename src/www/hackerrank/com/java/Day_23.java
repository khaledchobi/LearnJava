package www.hackerrank.com.java;

import java.util.*;
import java.io.*;

/*class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}*/
public class Day_23 {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static Queue<Node> queue = new LinkedList<Node>();
    static void levelOrder(Node root){
        //Write your code here
        if( root != null ){
            queue.add(root);
        }
        while( !queue.isEmpty() ){
            Node tree = queue.remove();
            System.out.print(tree.data + " ");

            if( tree.left != null ){
                queue.add( tree.left );
            }
            if( tree.right != null ){
                queue.add( tree.right );
            }
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
