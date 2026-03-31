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
    public int maxDepth(TreeNode root) {
        Deque<Pair<TreeNode, Integer>> seen = new ArrayDeque<>();
        int depth = 0;

        if(root != null){
            seen.push(new Pair<TreeNode, Integer>(root, 1));
        }

        while(!seen.isEmpty()){
            Pair<TreeNode, Integer> cur = seen.pop();
            TreeNode node = cur.getKey();
            int level = cur.getValue();

            if(node != null){
                depth = Math.max(level, depth);

                if(node.left != null) seen.push(new Pair<TreeNode, Integer>(node.left, level + 1));
                if(node.right != null) seen.push(new Pair<TreeNode, Integer>(node.right, level + 1));
            }
        }

        return depth;
    }
}
