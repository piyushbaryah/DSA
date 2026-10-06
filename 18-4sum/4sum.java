class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            Set<Integer> el = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long fourth = (long)target -nums[i]-nums[j]-nums[k];
                    if(fourth<=Integer.MAX_VALUE && fourth>=Integer.MIN_VALUE && el.contains((int)fourth)){
                        List<Integer> sc = new ArrayList<>();
                        sc.add(nums[i]);
                        sc.add(nums[j]);
                        sc.add(nums[k]);
                        sc.add((int)fourth);
                        ans.add(sc);
                    }
                    el.add(nums[k]);
                }
            }

        }
    res.addAll(ans);
        return res;
    }
}