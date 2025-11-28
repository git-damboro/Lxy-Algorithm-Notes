package com.lxy.leetcode.swordoffer.array;

/**
 * LCR 135. 报数 (原题：打印从1到最大的n位数)
 * <p>
 * 题目描述：
 * 从数字 1 开始，到最大的正整数 cnt 位数字结束。
 * <p>
 * 核心考点：数组操作 / 数学
 * 思路：计算出最大值 10^cnt - 1，循环填充数组。
 */
public class LCR135_CountNumbers {
    public int[] countNumbers(int cnt) {
        int max = (int) Math.pow(10, cnt);
        int[] res = new int[max - 1];

        for (int i = 0; i < max - 1; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}