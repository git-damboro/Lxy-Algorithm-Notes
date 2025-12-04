package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;

/**
 * LCR 174. 寻找二叉搜索树中的目标节点 (原题：二叉搜索树的第k大节点)
 * <p>
 * 核心考点：二叉搜索树(BST)特性 / 中序遍历
 * 思路：
 * BST 的中序遍历（左->根->右）是递增的。
 * 要找“第 K 大”，只需要“反向中序遍历”（右->根->左），就是递减的。
 * 遍历到第 k 个节点，就是答案。
 */
public class LCR174_KthLargest {
    int res, k;

    public int findTargetNode(TreeNode root, int cnt) {
        this.k = cnt;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null) return;

        // 1. 先去右边 (找最大的)
        dfs(root.right);

        // 2. 剪枝：如果k已经减到0了，说明找到了，没必要继续
        if (k == 0) return;

        // 3. 处理当前节点
        if (--k == 0) {
            res = root.val;
            return;
        }

        // 4. 最后去左边
        dfs(root.left);
    }
}