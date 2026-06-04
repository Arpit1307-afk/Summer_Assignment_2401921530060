class Solution {
    public int diagonalSum(int[][] mat) {
       int n=mat.length; //mat is a square matrix
       int sum=0;
    //    int mid=(n%2==0)? -1 : n/2;
    //    for(int i=0;i<n;i++) sum+=mat[i][i]+mat[i][n-i-1];
    //    sum=(mid==-1) ? sum : (sum-mat[mid][mid]);
    //    return sum; 

    //M-2 without using mid'
        for(int i=0;i<n;i++){
            sum+=mat[i][i];  //primary diagonal
            if(i!=n-i-1) sum+=mat[i][n-i-1]; // secondary diagonal;
        }
        return sum;
    }
}