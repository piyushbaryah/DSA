class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            ArrayList<Integer> sc = new ArrayList<>();

            for(int j=0;j<matrix[0].length;j++){
                sc.add(matrix[i][j]);
            }
            res.add(sc);
        }

        System.out.println(res);
    }
}