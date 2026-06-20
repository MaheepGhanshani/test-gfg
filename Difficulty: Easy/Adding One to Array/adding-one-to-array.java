class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
     
        // code here
     int carry =1;
     for(int i=arr.length-1;i>=0;i--){
         int sum=arr[i]+carry;
         arr[i]=sum%10;
         carry=sum/10;
     }
     Vector<Integer>ans=new Vector<>();
     if(carry>0){
         ans.add(carry);
     }
     for(int num:arr){
         ans.add(num);
     }
     return ans ;
    }
}