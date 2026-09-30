class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> sc = new ArrayList<>();
        int max=arr[n-1];
        sc.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                sc.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(sc);
        return sc;
    }
}

