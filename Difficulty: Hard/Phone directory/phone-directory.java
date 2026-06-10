// User function Template for Java

class Solution {
static  class Node{
        Node[] children = new Node[26];
        boolean eow=false;
    }
static    Node root=new Node();
    public static void insert(String word){
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
    
    public static void getwords(Node root,String word,ArrayList<String>list ){
        if(root.eow){
            list.add(word);
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
            char ch =(char)(i+'a');
            getwords(root.children[i],word+ch,list);
            }
        }
    }
    static ArrayList<ArrayList<String>> displayContacts(int n, String contact[],
                                                        String s) {
        // code here
          root = new Node(); 
        for(String str:contact){
            insert(str);
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
       Node curr=root;
        String prefix="";
        boolean found=true;
        for(int i=0;i<s.length();i++){
           prefix += s.charAt(i);
            ArrayList<String>temp=new ArrayList<>();
            if(found==false){
                temp.add("0");
                ans.add(temp);
                continue;
            }
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]==null){
                temp.add("0");
                found=false;
            }
            else{
                curr=curr.children[idx];
                getwords(curr,prefix,temp);
            }
            ans.add(temp);
        }
        return ans;
    }
}