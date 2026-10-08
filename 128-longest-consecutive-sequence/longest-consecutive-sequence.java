class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> sc = new HashSet<>();
        int longest=1;
        if(n==0) return 0;
        for(int i: nums){
            sc.add(i);
        } 

            
            
        for(int i: sc){
            if(!sc.contains(i-1)){
                int count=1;
                int small=i;

                while(sc.contains(i+1)){
                    count++;
                    small=i+1;
                    i++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}