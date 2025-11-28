package com.lxy.leetcode.swordoffer.tree;

import com.lxy.leetcode.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * LCR 124. 推理二叉树 (原题：重建二叉树)
 * <p>
 * 题目描述：
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * <p>
 * 核心考点：分治算法 / 递归
 * 思路：
 * 1. 前序的第一个是【根】。
 * 2. 在中序里找到【根】的位置，左边是左子树，右边是右子树。
 * 3. 利用 HashMap 加速查找根在中序的位置。
 * 4. 递归构建左右子树。
 */
public class LCR124_DeduceTree {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode deduceTree(int[] preorder, int[] inorder) {
        // 缓存中序遍历的索引，实现 O(1) 查找
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd) return null;

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        // 找到根在中序的位置
        int index = map.get(rootVal);
        // 左子树的长度
        int leftSize = index - inStart;

        // 递归构建
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, index - 1);
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                inorder, index + 1, inEnd);
        return root;
    }
}