class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        int low=1;
        int high=m;
        
        while(low<=high){
            int mid=(low+high)/2;
            long res=1;
            
            for(int i=0;i<n;i++){
                res=res*mid;
                if(res>m){
                    break;
                }
            }
            if(res==m) return mid;
            else if(res<m) low=mid+1;
            else high=mid-1;
        }
        return -1;
}
}