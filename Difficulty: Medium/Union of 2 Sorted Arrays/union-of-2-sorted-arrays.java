class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!arr.contains(a[i])){
                arr.add(a[i]);
            }
            // else if(!arr.contains(b[i])){
            //     arr.add(b[i]);
            // }
        }
        for(int i=0;i<b.length;i++){
            if(!arr.contains(b[i])){
                arr.add(b[i]);
            }
            // else if(!arr.contains(b[i])){
            //     arr.add(b[i]);
            // }
        }
        ArrayList<Integer> arr1 = new ArrayList<>(arr);
        Collections.sort(arr1);
        return arr1;
    }
}
