class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int min=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                min=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(min==0 && target<nums[0]){
            min=0;
        }
        else if(min==0 && target>nums[n-1]){
            min=nums.length;
        }
        return min;
    }
}