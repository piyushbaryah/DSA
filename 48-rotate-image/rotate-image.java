class Solution {
    public static void swap(int a[][],int i,int j ){
        int temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }

    public static void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    }

    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }

        for(int i=0;i<m;i++){
            int p=n-1;
            for(int j=0;j<n/2;j++){
                swap(matrix[i],j,p--);
            }
        }
    }
}