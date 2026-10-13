class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                if(min>nums[low]){
                    index=low;
                    min=nums[low];
                }
                    low=mid+1;
            }
                else{
                    if(min>nums[mid]){
                    index=mid;
                    min=nums[mid];
                }
                    high=mid-1;
                    
                }
                
            }
            
        return index;
        
    }
}