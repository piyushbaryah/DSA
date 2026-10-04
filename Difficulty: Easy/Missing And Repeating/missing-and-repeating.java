class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> sc = new ArrayList<>();
        HashMap<Integer,Integer> res = new HashMap<>();
        int n=arr.length;
        int el=0;
        for(int i=0;i<n;i++){
            res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        for(Integer x: res.keySet()){
            if(res.get(x)>1){
                el=x;
                sc.add(x);
            }
        }
        int sum=0;
        int act=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=el){
                
            sum+=arr[i];
            }
        }
        
        for(int i=1;i<=n;i++){
            act+=i;
        }
        sum+=el;
        int missing=act-sum;
        sc.add(missing);
        
        
        return sc;
    }
}
