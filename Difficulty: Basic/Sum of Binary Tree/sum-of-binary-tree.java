/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int sumBT(Node root) {
        if(root==null){
            return 0;
        }
        int leftsum=sumBT(root.left);
        int rightsum=sumBT(root.right);
        return leftsum+rightsum+root.data;
        // code here
        
    }
}