package com.lxy.leetcode.swordoffer.array;

/**
 * LCR 121. 寻找目标值 - 二维数组 (原题：二维数组中的查找)
 * 核心考点：线性查找 / 降维打击
 * 思路：从右上角(或左下角)开始，类似二叉搜索树，向左变小，向下变大。
 * 时间复杂度：O(N+M)
 */
public class LCR121_FindNumberIn2DArray {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        if (plants == null || plants.length == 0 || plants[0].length == 0) return false;

        int rows = plants.length, cols = plants[0].length;
        // 从右上角开始
        int r = 0, c = cols - 1;

        while (r < rows && c >= 0) {
            if (plants[r][c] == target) return true;
            else if (plants[r][c] > target) c--; // 大了，往左走
            else r++; // 小了，往下走
        }
        return false;
    }
}