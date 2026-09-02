/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean leftToRight=true;
        while(q.peek()!=null){
            LinkedList<Integer> sublist=new LinkedList<>();
            while(q.peek()!=null){
                TreeNode node=q.poll();
                if(leftToRight==true){
                    sublist.addLast(node.val);
                }else if(leftToRight==false){
                    sublist.addFirst(node.val);
                }
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            leftToRight=!leftToRight;
            list.add(sublist);
            q.add(q.poll());

        }
        return list;
    }
}