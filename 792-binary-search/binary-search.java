class Solution {
    public int bin(int[] arr,int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(target>arr[mid]){
            return bin(arr,mid+1,high,target);
        }
        else{
            return bin(arr,low,mid-1,target);
        }
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        return bin(nums,low,high,target);
    }
}
