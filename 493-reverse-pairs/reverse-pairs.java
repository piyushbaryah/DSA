class Solution {

    public static void merge(int[] nums,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> sc = new ArrayList<>();

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                sc.add(nums[left]);
                left++;
            }
            else{
                sc.add(nums[right]);
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
            nums[i]=sc.get(i-low);
        }

    }
    public static int countNum(int[] nums,int low,int mid,int high){
        int right=mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>2L*nums[right]){
                right++;
            }
                cnt+=(right-(mid+1));
        }
        return cnt;
        
    }
    public static int mS(int[] nums,int low,int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid = (low+high)/2;
        cnt+=mS(nums,low,mid);
        cnt+=mS(nums,mid+1,high);
        cnt+=countNum(nums,low,mid,high);
        merge(nums,low,mid,high);
    return cnt;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mS(nums,0,n-1);
    }
}