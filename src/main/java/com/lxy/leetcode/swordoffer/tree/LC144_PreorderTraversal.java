package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode; // 引入公用节点
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * LC 144. 二叉树的前序遍历
 * 核心考点：树的遍历 (递归 & 迭代)
 * 思路：迭代法利用栈，注意栈是先进后出，所以要【先压右孩子，再压左孩子】。
 */
public class LC144_PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val); // 根

            // 先右后左
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;
    }
}