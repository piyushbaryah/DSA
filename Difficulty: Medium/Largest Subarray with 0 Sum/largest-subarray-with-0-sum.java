class Solution {
    int maxLength(int arr[]) {
        // code here
        int k=0;
        HashMap<Integer,Integer> sc = new HashMap<>();
        int maxlen=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=i+1;
            }
            if(sc.containsKey(sum-k)){
                maxlen=Math.max(maxlen,i-sc.get(sum-k));
            }
            if(!sc.containsKey(sum)){
                sc.put(sum,i);
            }
            
        }
        return maxlen;
    }
}