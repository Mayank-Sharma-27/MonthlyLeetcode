package day12;


import lombok.Data;

public class Day12 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        solve(root, val);
        return root;

    }

    void solve(TreeNode node, int val) {

        if (node == null) {
            node = new TreeNode(val);
            return;
        }

        if (node.val > val) {
            if (node.left == null) {
                TreeNode n = new TreeNode(val);
                node.setLeft(n);
                return;
            }
            solve(node.left, val);
        }

        if (node.val < val) {
            if (node.right == null) {
                TreeNode n = new TreeNode(val);
                node.right = n;
                return;
            }
            solve(node.right, val);
        }
        return;

    }


    @Data
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
