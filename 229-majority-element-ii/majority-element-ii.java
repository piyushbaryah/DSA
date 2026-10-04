class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> sc = new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> res  = new HashMap<>();

        for(int i=0;i<n;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }

        for(Integer i: res.keySet()){
            if(res.get(i)>n/3){
                sc.add(i);
            }
        }
        return sc;
    }
}