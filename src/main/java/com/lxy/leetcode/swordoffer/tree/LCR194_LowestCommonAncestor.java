package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;

/**
 * LCR 194. 二叉树的最近公共祖先
 * <p>
 * 核心考点：后序遍历 / 递归逻辑
 * 思路：
 * 采用自底向上的递归。
 * 1. 如果当前节点是 p 或 q，返回当前节点。
 * 2. 如果左右子树都返回了非空节点，说明 p,q 分居两侧，当前节点就是 LCA。
 * 3. 如果只有一边返回了非空，说明 p,q 都在那一边。
 */
public class LCR194_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 1. 终止条件
        if (root == null || root == p || root == q) {
            return root;
        }

        // 2. 递：去左右两边找
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 3. 归：根据汇报做决策
        if (left != null && right != null) return root; // 分岔口
        if (left != null) return left;
        return right;
    }
}