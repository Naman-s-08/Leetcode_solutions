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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        queue.add(root);
        queue.add(null);

        while(queue.peek()!=null){
            double sum=0;
            int nodes=0;

            while(queue.peek()!=null){
                TreeNode node=queue.poll();
                sum+=node.val;
                nodes++;

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            queue.add(queue.poll());
            list.add(sum/nodes);
        }
        return list;
    }
}