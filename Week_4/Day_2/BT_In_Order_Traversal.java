import java.util.*;
class Solution {
    public static void helper(TreeNode root,ArrayList<Integer> ans)
    {
        if(root==null) return;
        helper(root.left,ans);
        ans.add(root.val);
        helper(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
}