class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        HashMap<Integer,Integer> sc = new HashMap<>();

        for(int i=0;i<n;i++){
            int current=nums[i];
            int needed=target-nums[i];
            if(sc.containsKey(needed)){
                arr[0]=sc.get(needed);
                arr[1]=i;
                return arr;
            }
            sc.put(nums[i],i);
        }
        return arr;
    }
}