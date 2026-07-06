class Solution {
    int max=0;  //if we write static then it will store the previous value when cheking another test case that causes error
    public int level(TreeNode root){
        if(root==null) return 0;
        int left=level(root.left);
        int right=level(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        level(root);
        return max;
    }
}