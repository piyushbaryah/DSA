class Solution {
    public int missingNumber(int[] nums) {
        int actSum=0;
        int Sum=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            actSum+=nums[i];
        }

        for(int i=1;i<=nums.length;i++){
            Sum+=i;
        }

        return Sum-actSum;
    }
}