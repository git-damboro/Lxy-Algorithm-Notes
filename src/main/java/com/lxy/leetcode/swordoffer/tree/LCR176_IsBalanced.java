package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;

/**
 * LCR 176. 判断是否为平衡二叉树
 * 核心考点：后序遍历 (自底向上) / 剪枝
 * 思路：
 * 自底向上计算高度，一旦发现不平衡 (高度差>1)，直接返回 -1 标记。
 */
public class LCR176_IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }
    int recur(TreeNode root) {
        if(root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) <= 1) {
            return Math.max(left, right) + 1;
        } else {
            return -1;
        }
    }
}