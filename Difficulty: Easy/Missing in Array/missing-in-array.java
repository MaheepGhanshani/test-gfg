class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
      
        int sum =0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
          int arsum=0;
        for(int j=0;j<arr.length;j++){
            arsum+=arr[j];
        }
      return sum-arsum;
    }
}