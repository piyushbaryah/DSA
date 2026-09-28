class Solution {
    public int search(int arr[], int x) {
        // code here
        int index=0;
        int n=arr.length;
        int flag=0;
        if(x<0){
            return -1;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=1;
                index=i;
                break;
            }
            
        }
        if(flag==1) return index;
     else{
         return -1;
     }
    }
}
