class Solution {
    class Node {
        Node[] children=new Node[26];
        boolean eow;
    }
    Node root=new Node();
    String ans="";
    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public void dfs(Node root,StringBuilder temp){
    if(root==null){
        return;
    }
    for(int i=0;i<26;i++){
        if(root.children[i]!=null && root.children[i].eow==true){
            temp.append((char)(i+'a'));
     
        if(temp.length()>ans.length()){
            ans=temp.toString();
        }
        dfs(root.children[i],temp);
        temp.deleteCharAt(temp.length()-1);
    }
    }
    }
    public String longestValidWord(String[] words) {
        for(String word:words){
            insert(word);
        }
        // code here
        dfs(root,new StringBuilder());
        return ans;
    }
}