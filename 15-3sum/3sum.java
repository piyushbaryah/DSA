class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> remDup = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> store = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                List<Integer> sc = new ArrayList<>();
                if(store.contains(third)){
                    sc.add(nums[i]);
                    sc.add(nums[j]);
                    sc.add(third);
                    Collections.sort(sc);
                    remDup.add(sc);
                }
                store.add(nums[j]);
            }
        }
        result.addAll(remDup);
        return result;
    }
}