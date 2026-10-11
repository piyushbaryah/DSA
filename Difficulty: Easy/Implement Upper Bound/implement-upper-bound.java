class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        int min=arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                min=mid;
                high=mid-1;
            }
            else if(target>=arr[mid]){
                low=mid+1;
            }
        }
        return min;
    }
}
