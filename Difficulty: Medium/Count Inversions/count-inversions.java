class Solution {
    public static int merge(int[] nums, int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int count=0;
        ArrayList<Integer> sc = new ArrayList();
        while(left<=mid && right<=high ){
            if(nums[left] <= nums[right]){
                sc.add(nums[left]);
                left++;
            }
            else{
                sc.add(nums[right]);
                count += mid - left + 1;
                right++;
            }
        }
        while(left<=mid){
            sc.add(nums[left]);
            left++;
        }
        while(right<=high){
            sc.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i] = sc.get(i-low);
        }
        return count;
    }
    
    
    public static int mS(int[] arr, int low,int high){
        int count=0;
        if(low>=high) return count;
        int mid=(low+high)/2;
        count+=mS(arr,low,mid);
        count+=mS(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    public int inversionCount(int arr[]) {
        // code here
        int n=arr.length;
        return mS(arr,0,n-1);
    }
}