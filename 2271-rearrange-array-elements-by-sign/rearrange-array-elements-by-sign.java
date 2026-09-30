class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n/2];
        int i1=0;
        int i2=0;
        ArrayList<Integer> sc = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                arr1[i1]=nums[i];
                i1++;
            }
            else{
                arr2[i2++]=nums[i];
            }
        }
        i1=0;
        i2=0;
        for(int i=0;i<n/2;i++){
            sc.add(arr1[i1]);
            i1++;
            sc.add(arr2[i2]);
            i2++;
        }
        int[] c = new int[n];
        int i=0;
        for(int x:sc){
            c[i++]=x;
        }
        return c;
    }
}