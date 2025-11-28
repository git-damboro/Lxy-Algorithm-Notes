package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;
import java.util.*;

/**
 * LCR 150. 彩灯装饰记录 II (分层打印)
 * 核心考点：BFS / 利用 queue.size() 控制层级
 */
public class LCR150_LevelOrderII {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size(); // 锁定当前层节点数
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(level);
        }
        return res;
    }
}