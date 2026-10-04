class Solution {
    public static void rev(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
        rev(nums,index+1,n-1);
        return;
        }
        
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[index]){
            swap(nums,i,index);
            break;
            }
        }


        rev(nums,index+1,n-1);
    }
}