class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> sc = new ArrayList<>();
        int n=nums.length;
        int c1=0;
        int c2=0;
        int el1=0;
        int el2=0;
        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=el2){
                c1=1;
                el1=nums[i];
            }
            else if(c2==0 && nums[i]!=el1){
                c2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                c1++;
            }
            else if(el2==nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
            
        }

        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++){
            if(nums[i]==el1){
                count1++;
            }
            else if(nums[i]==el2){
                count2++;
            }
        }

        if(count1 > n/3){
            sc.add(el1);
        }

        if(count2 > n/3){
            sc.add(el2);    
        }
        return sc;
    }
}