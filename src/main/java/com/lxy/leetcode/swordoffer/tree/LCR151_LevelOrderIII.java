package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;
import java.util.*;

/**
 * LCR 151. 彩灯装饰记录 III (Z字形打印)
 * 核心考点：双栈法 (或 Deque 头插法)
 * 思路：这里记录的是你后来写出的“双栈法”最优解。
 */
public class LCR151_LevelOrderIII {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack0 = new LinkedList<>(); // 奇数层
        Deque<TreeNode> stack1 = new LinkedList<>(); // 偶数层
        stack0.push(root);

        while (!stack0.isEmpty() || !stack1.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (!stack0.isEmpty()) {
                while (!stack0.isEmpty()) {
                    TreeNode node = stack0.pop();
                    list.add(node.val);
                    if (node.left != null) stack1.push(node.left);
                    if (node.right != null) stack1.push(node.right);
                }
            } else {
                while (!stack1.isEmpty()) {
                    TreeNode node = stack1.pop();
                    list.add(node.val);
                    if (node.right != null) stack0.push(node.right);
                    if (node.left != null) stack0.push(node.left);
                }
            }
            res.add(list);
        }
        return res;
    }
}