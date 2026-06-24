class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int prev = i-1;
            while(prev>=0 && current <arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
        
    }
}