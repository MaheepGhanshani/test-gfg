/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/
class Solution
{
    public void inorder(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }

        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }

    public ArrayList<Integer> merge(Node root1, Node root2)
    {
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();

        inorder(root1,arr1);
        inorder(root2,arr2);

        ArrayList<Integer>temp=new ArrayList<>();

        int i=0,j=0;

        while(i<arr1.size() && j<arr2.size()){

            if(arr1.get(i)<arr2.get(j)){
                temp.add(arr1.get(i++));
            }
            else{
                temp.add(arr2.get(j++));
            }
        }

        while(i<arr1.size()){
            temp.add(arr1.get(i++));
        }

        while(j<arr2.size()){
            temp.add(arr2.get(j++));
        }

        return temp;
    }
}