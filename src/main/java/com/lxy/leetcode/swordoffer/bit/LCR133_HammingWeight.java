package com.lxy.leetcode.swordoffer.bit;

/**
 * LCR 133. 位 1 的个数 (原题：二进制中1的个数)
 * 核心考点：位运算技巧
 * 解法：n & (n - 1)
 * 时间复杂度：O(M) (M为1的个数)
 */
public class LCR133_HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        // 核心技巧：n & (n - 1) 可以消除二进制中最右边的一个 1
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}