/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myhieght=Math.max(left.ht,right.ht)+1;
        int diam1=left.diam;
        int diam2= right.diam;
        int diam3 =left.ht+right.ht;
        int mydiam=Math.max(diam3,Math.max(diam2,diam1));
        TreeInfo myInfo=new TreeInfo(myhieght,mydiam);
        return myInfo;
    }
    public int diameter(Node root) {
        // code herer
        TreeInfo ans=diameter2(root);
        return ans.diam;
        
    }
}