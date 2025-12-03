package com.lxy.leetcode.swordoffer.array;

/**
 * LCR 146. 螺旋遍历二维数组 (原题：顺时针打印矩阵)
 * <p>
 * 核心考点：数组边界模拟
 * 思路：
 * 设定上下左右四个边界 (t, b, l, r)。
 * 按照 右 -> 下 -> 左 -> 上 的顺序循环打印。
 * 每次打印完一行/列，立即收缩边界并检查是否越界。
 */
public class LCR146_SpiralArray {
    public int[] spiralArray(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }
        int l = 0, r = array[0].length - 1;
        int t = 0, b = array.length - 1;
        int[] res = new int[(r + 1) * (b + 1)];
        int x = 0;

        while (true) {
            // 向右
            for (int i = l; i <= r; i++) res[x++] = array[t][i];
            if (++t > b) break;

            // 向下
            for (int i = t; i <= b; i++) res[x++] = array[i][r];
            if (l > --r) break;

            // 向左
            for (int i = r; i >= l; i--) res[x++] = array[b][i];
            if (t > --b) break;

            // 向上
            for (int i = b; i >= t; i--) res[x++] = array[i][l];
            if (++l > r) break;
        }
        return res;
    }
}