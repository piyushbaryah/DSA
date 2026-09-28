class Solution {

    public void reverse(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }

    public void reverse(int[] arr,int a,int b){
        

        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        } 

        
    }

    public void rotate(int[] nums, int k) {
        int n=nums.length;

        if(n == 0) {
            return;
        }

        k=k%n;
        
        reverse(nums);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}