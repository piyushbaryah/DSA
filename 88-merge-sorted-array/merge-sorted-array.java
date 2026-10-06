class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        int[] temp= new int[m+n];
        int c=m+n;
        for(int i=0;i<m;i++){
            temp[index]=nums1[i];
            index++;
        }

        for(int i=0;i<n;i++){
            temp[index]=nums2[i];
            index++;
        }

        for(int i=0;i<temp.length;i++){
            nums1[i]=temp[i];
        }
        Arrays.sort(nums1);
    }
}