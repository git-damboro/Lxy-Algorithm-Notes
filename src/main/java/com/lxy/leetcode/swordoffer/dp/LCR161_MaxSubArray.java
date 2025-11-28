package com.lxy.leetcode.swordoffer.dp;

/**
 * LCR 161. 连续天数的最高销售额
 * 核心考点：DP / 贪心 / 前缀和思想
 */
public class LCR161_MaxSubArray {
    public int maxSales(int[] sales) {
        int max = sales[0];
        int cur = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (cur < 0) cur = sales[i]; // 负债累累，另起炉灶
            else cur += sales[i];        // 正收益，继续累加
            max = Math.max(max, cur);
        }
        return max;
    }
}