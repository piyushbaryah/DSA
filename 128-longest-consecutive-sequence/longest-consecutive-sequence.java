class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        int n= nums.length;
        int small = Integer.MIN_VALUE;
        Arrays.sort(nums);
        if(n==0){
            return 0;
        }
        int cnt=1;
        for(int i=0;i<n;i++){
            if(nums[i]-1==small){
                cnt++;
                small=nums[i];
            }
            else if(nums[i]==small){
                continue;
            }
            else if(nums[i]!=small){
                cnt=1;
                small=nums[i];
            }
            if(longest<cnt){
                longest=cnt;
            }

            
        }
        return longest;
    }
}