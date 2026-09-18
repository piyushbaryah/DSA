class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=0;
                }
        }
        
        int secMax=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>secMax){
                secMax=arr[i];
            }
        }
        
        if(secMax==0){
            return -1;
        }
        
        return secMax;
    }
}