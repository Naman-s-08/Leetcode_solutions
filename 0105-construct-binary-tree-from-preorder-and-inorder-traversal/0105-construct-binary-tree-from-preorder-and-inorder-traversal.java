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
    private int preOrderIndex;
    private Map<Integer,Integer> inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap=new HashMap<>();
        preOrderIndex=0;
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return Solution(preorder ,0,inorder.length-1);
    }
    private TreeNode Solution(int[] preorder,int start,int end){
        if(start>end) return null;

        int rootValue=preorder[preOrderIndex++];
        TreeNode root=new TreeNode(rootValue);

        int inorderIndex=inorderMap.get(rootValue);

        root.left=Solution(preorder,start,inorderIndex-1);
        root.right=Solution(preorder,inorderIndex+1,end);

        return root;
    }
}