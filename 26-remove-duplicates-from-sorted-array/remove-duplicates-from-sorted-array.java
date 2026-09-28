class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> ar = new LinkedHashSet<>();

        for(int i=0;i<nums.length;i++){
            ar.add(nums[i]);
        }
        int i=0;
        for(int x:ar){
            nums[i]=x;
            i++;
        }

        return i;
    }
}