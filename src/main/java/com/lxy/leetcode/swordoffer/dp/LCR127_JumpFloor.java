package com.lxy.leetcode.swordoffer.dp;

/**
 * LCR 127. 跳跃训练 (青蛙跳台阶)
 * 核心考点：DP / 斐波那契变种
 */
public class LCR127_JumpFloor {
    public int trainWays(int num) {
        if (num == 0 || num == 1) return 1;
        int a = 1, b = 1, sum;
        for (int i = 2; i <= num; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}