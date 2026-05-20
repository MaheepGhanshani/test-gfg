/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        // code here
        inorder(root,ans);
        return ans;
        
    }
    public void inorder(Node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
}