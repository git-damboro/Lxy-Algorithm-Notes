package com.lxy.leetcode.swordoffer.bit;

/**
 * LCR 134. Pow(x, n) (数值的整数次方)
 * 核心考点：快速幂 (二进制拆分)
 * 时间复杂度：O(log N)
 */
public class LCR134_MyPow {
    public double myPow(double x, int n) {
        long N = n; // 使用 long 防止 -2147483648 转正溢出
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double res = 1.0;
        while (N > 0) {
            // 如果当前二进制位是 1，把当前底数乘进结果
            if ((N & 1) == 1) {
                res *= x;
            }
            // 底数翻倍 (x -> x^2 -> x^4 ...)
            x *= x;
            // 指数减半 (右移)
            N /= 2;
        }
        return res;
    }
}