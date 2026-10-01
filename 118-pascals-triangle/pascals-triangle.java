class Solution {
    
    public static int C(int r,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(r-i);
            res=res/(i+1);
        }
        return res;
    }

    public static List<List<Integer>> ncr(int r){
       
        List<List<Integer>> res = new ArrayList<>();
        for(int row=1;row<=r;row++){

            List<Integer> rowList = new ArrayList<>();

            for(int col=1;col<=row;col++){
                
                int ans = C(row-1,col-1);
                rowList.add(ans);

            }
        res.add(rowList);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {

        return ncr(numRows);

    }
}