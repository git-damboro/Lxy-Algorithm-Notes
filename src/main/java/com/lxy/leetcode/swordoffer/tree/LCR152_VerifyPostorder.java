package com.lxy.leetcode.swordoffer.tree;

/**
 * LCR 152. 验证二叉搜索树的后序遍历序列
 * 核心考点：分治法 / BST 特性
 * 思路：
 * 1. 根是最后一个元素。
 * 2. 找到第一个大于根的元素位置 m，划分左右子树。
 * 3. 验证右子树部分是否全大于根。
 * 4. 递归检查左右子树。
 */
public class LCR152_VerifyPostorder {
    public boolean verifyTreeOrder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(p < j) {
            if(postorder[p] < postorder[j]) return false;
            p++;
        }
        return recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}