class Solution {

    public static List<List<Integer>> Row(int r){
        List<List<Integer>> sc = new ArrayList<>();
        for(int j=0;j<r;j++){
            long res=1;
            List<Integer> ans = new ArrayList<>();
            ans.add((int)res);
            for(int i=0;i<j;i++){
                res=res*(j-i);
                res=res/(i+1);
                ans.add((int)res);
            }
            sc.add(ans);
        }
        return sc;
    }

    public List<List<Integer>> generate(int numRows) {
     
     return Row(numRows);

    }
}