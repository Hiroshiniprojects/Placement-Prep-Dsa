class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
            for(int k=0;k<n;k++){
                for(int l=0;l<m/2;l++){
                    int temp=matrix[k][l];
                    matrix[k][l]=matrix[k][n-1-l];
                    matrix[k][n-1-l]=temp;
                }
            }

        
        
    }
}