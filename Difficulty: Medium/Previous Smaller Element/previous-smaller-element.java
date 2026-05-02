class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }
        return ans;
    }
}