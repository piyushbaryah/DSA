class Solution {
    public int subarraySum(int[] nums, int k) {
    
        HashMap<Integer,Integer> sc = new HashMap<>();
        int count=0;
        int sum=0;
        int n=nums.length;
        sc.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
             if(sc.containsKey(sum-k)){
                count += sc.get(sum-k);
            }

            sc.put(sum, sc.getOrDefault(sum, 0) + 1);
            
        }
        return count;
    }
}