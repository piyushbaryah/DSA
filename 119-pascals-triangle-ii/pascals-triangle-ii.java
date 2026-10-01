class Solution {
    public static List<Integer> Row(int r){
        long res=1;
        List<Integer> ans = new ArrayList<>();
        ans.add((int)res);
        for(int i=0;i<r;i++){
            res=res*(r-i);
            res=res/(i+1);
            ans.add((int)res);
        }
        return ans;
    }

    public List<Integer> getRow(int rowIndex) {
        return Row(rowIndex);
    }
}