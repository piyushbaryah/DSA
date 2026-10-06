class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k=j+1;
                int l=n-1;
                // if(i>0 && nums[k]==nums[k+1]) continue;
while(k<l){

                long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                if(sum<target){
                    k++;
                }
                else if(sum>target){
                    l--;
                }
                else{
                    List<Integer> sc = new ArrayList<>();
                    sc.add(nums[i]);
                    sc.add(nums[j]);
                    sc.add(nums[k]);
                    sc.add(nums[l]);

                    ans.add(sc);
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1]){
                        k++;
                    }
                    while(k<l && nums[l]==nums[l+1]){
                        l--;
                    }

                }
}
                
            }
        }
        res.addAll(ans);
        return res;
    }
}