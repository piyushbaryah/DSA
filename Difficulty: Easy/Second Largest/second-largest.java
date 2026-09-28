class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int n=arr.length;
        int max=arr[0];
        int sMax=0;
        
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=0;
            }
        }
        int flag=0;
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }
        // return 0;
        for(int i=0;i<n;i++){
            if(arr[i]>sMax ){
                sMax=arr[i];
                flag=1;
                

            }
        }
        if(flag==1){
            return sMax;
        }
        else{
            return -1;
        }
        
    }
}