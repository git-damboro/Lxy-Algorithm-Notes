package com.lxy.leetcode.swordoffer.sort;

/**
 * LCR 158. 库存管理 II (众数)
 * 核心考点：摩尔投票法 (O(1) 空间)
 */
public class LCR158_MajorityElement {
    public int inventoryManagement(int[] stock) {
        int x = 0, votes = 0;
        for (int num : stock) {
            if (votes == 0) x = num;
            votes += (num == x) ? 1 : -1;
        }
        return x;
    }
}