class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int mCount=0;
        for(int i=0;i<n;i++){
            int count=0;
            if(nums[i]==1){
                count=1;
            }
            for(int j=i+1;j<n;j++){
                if(nums[j]==0){
                    break;
                }
                count++;
            }

            if(mCount<count){
                mCount=count;
                count=0;
            }
        }

        return mCount;
    }
}