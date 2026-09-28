class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        int count=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                arr[index++]=nums[i];
            }
        }

        for(int i=index;i<n;i++){
            arr[i]=0;
        }

        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
    
}