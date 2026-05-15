class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q==null||k>q.size()) return q;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
       int size= q.size()-k;
       for(int i=0;i<size;i++){
           q.offer(q.poll());
       }
       return q;
       
    }
}