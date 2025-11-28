package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;

/**
 * LCR 143. 子结构判断
 * 核心考点：双重递归 (遍历找入口 + 递归比对)
 */
public class LCR143_SubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return check(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    boolean check(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return check(A.left, B.left) && check(A.right, B.right);
    }
}