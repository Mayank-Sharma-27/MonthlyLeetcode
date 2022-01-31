package day11;

import lombok.Data;

public class Day11 {


    int ans = 0;

    public int sumRootToLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);

        return ans;
    }


    void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) {

            return;
        }
        sb.append(String.valueOf(node.val));
        if (node.left == null && node.right == null) {

            String s = sb.toString();

            ans += Integer.parseInt(s, 2);
            sb.setLength(sb.length() - 1);
            return;
        }


        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.setLength(sb.length() - 1);


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
