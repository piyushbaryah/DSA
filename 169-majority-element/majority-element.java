class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        for(Integer i: arr.keySet()){
            if(arr.get(i)>n/2){
                return i;
            }
        }
        return 0;
    }
}