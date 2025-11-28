package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;

/**
 * LCR 145. 判断对称二叉树
 * 核心考点：双指针递归 (同时遍历两棵树)
 * 思路：左子树的左孩子 == 右子树的右孩子 && 左子树的右孩子 == 右子树的左孩子。
 */
public class LCR145_SymmetricTree {
    public boolean checkSymmetricTree(TreeNode root) {
        if (root == null) return true;
        return check(root.left, root.right);
    }
    boolean check(TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return check(L.left, R.right) && check(L.right, R.left);
    }
}