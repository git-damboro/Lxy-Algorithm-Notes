package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;

/**
 * LCR 144. 翻转二叉树 (原题：二叉树的镜像)
 * 核心考点：递归
 * 思路：左右交换，然后递归处理子树。
 */
public class LCR144_FlipTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}