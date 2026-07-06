class Solution {
    int ans=Integer.MIN_VALUE;  //
    public int helper(TreeNode root){
        if(root==null) return 0;
        int lst=helper(root.left);
        int rst=helper(root.right);
        lst=Math.max(0,lst);  //to avoid -ve values immediately
        rst=Math.max(0,rst);
        ans=Math.max(ans,root.val+lst+rst);
        return root.val+Math.max(lst,rst);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
}