// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
  static   class BSTInfo{
        int mini ;
        int maxa;
        int  mxsz;
        BSTInfo(int mini,int maxa,int mxsz){
            this.mini=mini;
            this.maxa=maxa;
            this.mxsz=mxsz;
        }
    }
    static BSTInfo largestbstbt(Node root){
        if (root==null){
            return  new BSTInfo(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        BSTInfo left=largestbstbt(root.left);
         BSTInfo right=largestbstbt(root.right);
         if(root.data>left.maxa&&root.data<right.mini){
             return new BSTInfo(
                 Math.min(root.data,left.mini),
                 Math.max(root.data,right.maxa),
                 left.mxsz+right.mxsz+1
                 );
         }
         else{
           return new BSTInfo(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.mxsz,right.mxsz));  
         }
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        return largestbstbt(root).mxsz;
        
    }
}