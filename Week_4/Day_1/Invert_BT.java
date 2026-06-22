class Solution {
    public static void helper(TreeNode root)
    {
       if(root==null) return;
       TreeNode temp=root.left;
       root.left=root.right;
       root.right=temp;
       helper(root.left); 
       helper(root.right);   
    }
    public TreeNode invertTree(TreeNode root) {
       //helper(root);

       //M-2 without helper  (pre order)
    //    if(root==null) return null;
    //    TreeNode temp=root.left;
    //    root.left=root.right;
    //    root.right=temp;
    //    helper(root.left); 
    //    helper(root.right);
    //    return root;
       //M-2 without helper  (post order)
    //    if(root==null) return null;
    //    helper(root.left); 
    //    helper(root.right);
    //    TreeNode temp=root.left;
    //    root.left=root.right;
    //    root.right=temp;
    //    return root;
       //M-2 without helper  (in order)
       if(root==null) return null;
       helper(root.left); 
       TreeNode temp=root.left;
       root.left=root.right;
       root.right=temp;
       helper(root.left);
       return root;
    }
}