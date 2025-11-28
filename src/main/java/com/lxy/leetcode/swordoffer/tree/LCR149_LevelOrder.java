package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;
import java.util.*;

/**
 * LCR 149. 彩灯装饰记录 I (层序遍历)
 * 核心考点：BFS / 队列
 */
public class LCR149_LevelOrder {
    public int[] decorateRecord(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
}