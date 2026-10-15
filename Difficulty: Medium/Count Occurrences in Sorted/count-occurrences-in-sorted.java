class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer> sc = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.put(arr[i],sc.getOrDefault(arr[i],0)+1);
        }
        
        for(Integer x: sc.keySet()){
            if(x==target){
                count=sc.get(x);
                break;
            }
        }
        return count;
    }
}
