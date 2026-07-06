import java.util.*;
class Pair{
    long min;
    long max;
    Pair(long min,long max){
        this.min=min;
        this.max=max;
    }
}
class Triplet{
    long min;
    long max;
    boolean isBST;
    Triplet(long min,long max,boolean isBST){
        this.min=min;
        this.max=max;
        this.isBST=isBST;
    }
}
class Solution {
    public boolean helper(TreeNode root,long min,long max){
        if(root==null) return true;
        if(root.val>=max || root.val<=min) return false;
        return helper(root.left,min,root.val) && helper(root.right,root.val,max);
    }
    boolean flag=true;
    public void helper(TreeNode root,ArrayList<Integer> arr){
        if(root==null || flag==false) return;
        helper(root.left,arr);
        arr.add(root.val);
        if(arr.size()>1){
            if(root.val<=arr.get(arr.size()-2)) flag=false;
        }
        helper(root.right,arr);
    }
    TreeNode pre=null;
    public boolean helper(TreeNode root){
        if(root==null) return true;
        if(!helper(root.left)){
            return false;
        }
        if(pre!=null && root.val<=pre.val) return false;
        pre=root;
        return helper(root.right);
    }
    boolean flag3;
    public Pair maxMin(TreeNode root){
        if(root==null) return new Pair(Long.MAX_VALUE,Long.MIN_VALUE);
        Pair lst=maxMin(root.left);
        Pair rst=maxMin(root.right);
        long val=(long)root.val;
        long max=Math.max(val,Math.max(lst.max,rst.max));
        long min=Math.min(val,Math.min(lst.min,rst.min));
        if(lst.max>=val || rst.min<=val) flag3=false;
        return new Pair(min,max);
    }
    public Triplet maxMinIsBST(TreeNode root){
        if(root==null) return new Triplet(Long.MAX_VALUE,Long.MIN_VALUE,true);
        Triplet lst=maxMinIsBST(root.left);
        Triplet rst=maxMinIsBST(root.right);
        long val=(long)root.val;
        long max=Math.max(val,Math.max(lst.max,rst.max));
        long min=Math.min(val,Math.min(lst.min,rst.min));
        boolean isBST= lst.isBST && rst.isBST && (val>lst.max) && (val<rst.min);
        return new Triplet(min,max,isBST);
    }
    public boolean isValidBST(TreeNode root) {
        //return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);  // (0ms)

        //M-2 using inorder traversal (0ms)
        // ArrayList<Integer> arr=new ArrayList<>();
        // helper(root,arr);
        // return flag;

        //M-3 using inorder traversal without arrayList (0ms)
        //return helper(root);

        //M-4 using pair class (1ms)  
        // flag3=true;
        // maxMin(root);
        // return flag3;

        //M-5 using Triplet class (1ms)
        //return maxMinIsBST(root).isBST;

        //M-6 (using morris traversal) (0ms)
        TreeNode curr=root;
        long pre=Long.MIN_VALUE;
        while(curr!=null){
            if(curr.left!=null){
                //find precessor
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                }
                if(pred.right==null) { //Linking part
                    pred.right=curr; 
                    curr=curr.left;
                }
                else{  // pre.right=curr (unlinking and printint)
                    pred.right=null;
                    if(curr.val<=pre) return false;
                    pre=(long)curr.val;
                    curr=curr.right;
                }
            }
            else{
                if(curr.val<=pre) return false;
                pre=(long)curr.val;
                curr=curr.right;
            }
        }
        return true;
    }
}