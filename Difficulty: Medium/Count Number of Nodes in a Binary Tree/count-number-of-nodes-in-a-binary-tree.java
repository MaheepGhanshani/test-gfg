// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        if(root==null){
            return 0;
        }
        // Code here
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        return leftNodes+rightNodes+1;
    }
}