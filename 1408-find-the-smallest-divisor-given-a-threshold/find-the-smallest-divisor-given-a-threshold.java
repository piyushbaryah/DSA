class Solution {

    public int max(int[] nums){
        int m=0;
        for(int i: nums){
            m=Math.max(m,i);
        }
        return m;
    }

    public int sumof(int[] nums,int mid){
        int sum=0;
        for(int i: nums){
            // int num=(int)Math.ceil((double)i/(double)mid);
            int num=(i+mid-1)/mid;
            sum+=num;

        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=max(nums);
        int res=0;

        while(low<=high){
            int mid=(low+high)/2;
            if(sumof(nums,mid)<=threshold){
                res=mid;
                high=mid-1;
            }
            else low=mid+1;
        
        }
        return res;
    }
}