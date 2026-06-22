class Solution {
    public boolean isSameTree(TreeNode r1, TreeNode r2) {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;  //means only one is null
        if(r1.val!=r2.val) return false;
        return isSameTree(r1.right,r2.right) && isSameTree(r1.left,r2.left);
    }
}