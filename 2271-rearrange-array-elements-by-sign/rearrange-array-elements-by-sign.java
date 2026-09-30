class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos=0;
        int neg=1;
        for(int x:nums){
            if(x>0){
                arr[pos]=x;
                pos+=2;
            }
            else{
                arr[neg]=x;
                neg+=2;
            }
        }

        return arr;
    }
}