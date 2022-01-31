package day26;

import day11.Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day26 {
    public List<Integer> getAllElements(Day11.TreeNode root1, Day11.TreeNode root2) {
        if (root1 == null && root2 == null) {
            return new ArrayList();
        }

        List<Integer> list1 = inorder(root1, new ArrayList());

        List<Integer> list2 = inorder(root2, new ArrayList());

        List<Integer> ans = new ArrayList();

        ans.addAll(list1);
        ans.addAll(list2);
        Collections.sort(ans);
        return ans;
    }

    private List<Integer> inorder(Day11.TreeNode root, List<Integer> ans) {
        if (root == null) {
            return ans;
        }

        inorder(root.getLeft(), ans);
        ans.add(root.getVal());
        inorder(root.getRight(), ans);
        return ans;
    }
}
