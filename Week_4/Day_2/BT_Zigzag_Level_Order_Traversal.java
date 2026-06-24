import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag=true;;
        while(queue.size()>0){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            flag=!flag;
            for(int i = 0; i < size; i++){  
                TreeNode node = queue.remove();
                if(flag) level.addFirst(node.val);
                else level.addLast(node.val);
                if(node.left != null) queue.add(node.left); //to add all nodes of same level
                if(node.right != null) queue.add(node.right);
            }
            //if(flag) Collections.reverse(level);  //M-2 use addFirst and addLast
            result.add(level);
        }
        return result;
    }
}