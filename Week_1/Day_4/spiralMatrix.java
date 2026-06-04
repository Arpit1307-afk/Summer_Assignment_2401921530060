import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowl=matrix.length;
        int coll=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        int rs=0,re=rowl-1,cs=0,ce=coll-1;
        while(rs<=re && cs<=ce)
        {
            for(int col=cs;col<=ce;col++)
            {
                ans.add(matrix[rs][col]);
            }
            rs++;
            for(int row=rs;row<=re;row++)
            {
                ans.add(matrix[row][ce]);
            }
            ce--;
            if(rs<=re){
            for(int col=ce;col>=cs;col--)
            {
                ans.add(matrix[re][col]);
            }
            re--;}
            if(cs<=ce){
            for(int row=re;row>=rs;row--)
            {
                ans.add(matrix[row][cs]);
            }
            cs++;}
        }
        return ans;
    }
}