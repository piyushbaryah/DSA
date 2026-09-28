class Solution {
    public int removeDuplicates(int[] nums) {
        
        int[] exp= new int[nums.length];
        int n = nums.length-1;
        
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[i+1]){
                nums[index]=nums[i];
                index++;
            }
        }
    
        nums[index]=nums[n];
        index++;

        return index;
    }
}