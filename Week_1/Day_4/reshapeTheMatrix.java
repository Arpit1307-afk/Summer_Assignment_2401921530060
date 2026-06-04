class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if((row==r && col==c) || (row*col!=r*c)) return mat;
        int[][] ans=new int[r][c];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int idx=i*col+j;  //converting index into a 1_D idx
                int m=idx/c;
                int n=idx%c;
                ans[m][n]=mat[i][j];
            }
        }
        return ans;
    }
}
