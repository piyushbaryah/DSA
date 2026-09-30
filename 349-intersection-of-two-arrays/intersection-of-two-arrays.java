class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr = new HashSet<>();
        for(int x:nums1){
            arr.add(x);
        }
        HashSet<Integer> a = new HashSet<>();
        for(int x: nums2){
            if(arr.contains(x)){
                a.add(x);
            }
        }
    int[] c = new int[a.size()];
    int p=0;
        for(int x:a){
            c[p]=x;
            p++;
        }
    System.out.println(a.size());
        return c;
    }
}
