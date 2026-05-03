class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        Stack<Integer>s=new Stack<>();
       
        for(int i=0;i<n;i++){
            s.push(i);
        }
            while(s.size()>1){
                int a=s.peek(); s.pop();
                int b=s.peek(); s.pop();
                if(mat[a][b]==0){
                    s.push(a);
                }else{
                    s.push(b);
                }
            }
            int celeb=s.peek();
            for(int i =0;i<n;i++){
                if(i!=celeb&&mat[celeb][i]==1||mat[i][celeb]==0){
                    return -1;
                }
            }
            return celeb;
        
    }
}