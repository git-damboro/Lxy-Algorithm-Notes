package com.lxy.leetcode.swordoffer.dp;

/**
 * LCR 126. 斐波那契数
 * <p>
 * 核心考点：动态规划 (滚动数组)
 * 思路：
 * 使用循环代替递归，防止超时。只存储最近的两个状态 (a, b)，空间 O(1)。
 */
public class LCR126_Fibonacci {
    public int fib(int n) {
        if (n < 2) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}