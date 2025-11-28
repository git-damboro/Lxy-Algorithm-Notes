package com.lxy.leetcode.swordoffer.backtracking;

import com.lxy.leetcode.common.TreeNode;
import java.util.*;

/**
 * LC 113. 路径总和 II
 * 核心考点：回溯算法 (路径记录与撤销)
 */
public class LC113_PathSumII {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }
    void dfs(TreeNode root, int target) {
        if (root == null) return;
        path.offerLast(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            res.add(new ArrayList<>(path)); // 必须拷贝
        }
        dfs(root.left, target);
        dfs(root.right, target);
        path.pollLast(); // 回溯：撤销选择
    }
}