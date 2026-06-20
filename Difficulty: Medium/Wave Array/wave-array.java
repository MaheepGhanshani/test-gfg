class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int i=0;
        
        while(i<arr.length-1){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            
            }
               i+=2;
        }
    }
}
