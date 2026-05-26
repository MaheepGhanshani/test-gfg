/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    Node prev=null;
    Node head=null;
    public Node flattenBST(Node root) {
        // code here
        inorder(root);
        if(prev!=null){
            prev.left=null;
            prev.right=null;
        }
        return head;
        
    }
    public  void inorder(Node root){
        if (root==null){
            return ;
        }
        inorder(root.left);
        if(prev==null){
            head=root;
        }
        else{
            prev.left=null;
            prev.right=root;
        }
        prev=root;
        inorder(root.right);
    }
}
