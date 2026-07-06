import java.util.*;
class Solution {
    boolean getPath(TreeNode root,TreeNode target,ArrayList<TreeNode> path){
        if(root==null) return false; 
        path.add(root);
        if(root==target) return true;
        boolean left=getPath(root.left,target,path);
        if(left) return true;
        boolean right=getPath(root.right,target,path);
        if(right) return true;

        // if both false then this will be executed
        path.remove(path.size()-1);
        return false;
    }
    boolean exist(TreeNode root,TreeNode n){
        if(root==null) return false;
        if(root==n) return true;
        return exist(root.left,n) || exist(root.right,n);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //M-1 (gives tle as worst TC O(n2) )
        // if(root==p || root==q) return root;
        // boolean pLeft=exist(root.left,p);
        // boolean qLeft=exist(root.left,q);
        // if(pLeft && qLeft) return lowestCommonAncestor(root.left,p,q);  //both towards left
        // else if(!pLeft && !qLeft) return lowestCommonAncestor(root.right,p,q);  //both towards right
        // else return root;

        //M-2 (asking child what u have)

        // if(root==null) return null;
        // if(root==p || root==q) return root;
        // TreeNode left=lowestCommonAncestor(root.left,p,q);
        // TreeNode right=lowestCommonAncestor(root.right,p,q);
        // if(left!=null && right!=null) return root;
        // return (left==null)? right : left;

        //M-3 building path and then calculating
        ArrayList<TreeNode> pPath=new ArrayList<>();
        ArrayList<TreeNode> qPath=new ArrayList<>();
        getPath(root,p,pPath);
        getPath(root,q,qPath);
        int i=0;
        TreeNode ans=null;
        while(i<pPath.size() && i<qPath.size()){
            if(pPath.get(i).equals(qPath.get(i))) {
                ans=pPath.get(i);
                i++;
            }
            else break;
        }
        return ans;
    }
}