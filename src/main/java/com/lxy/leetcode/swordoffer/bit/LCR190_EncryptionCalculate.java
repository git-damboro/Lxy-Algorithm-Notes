package com.lxy.leetcode.swordoffer.bit;

/**
 * LCR 190. 加密运算 (原题：不用加减乘除做加法)
 * 核心考点：计算机底层加法原理
 * 思路：
 * 1. 异或 (^) = 无进位加法
 * 2. 与 (&) + 左移 (<<) = 进位
 */
public class LCR190_EncryptionCalculate {
    public int encryptionCalculate(int dataA, int dataB) {
        // 只要还有进位，就继续循环
        while (dataB != 0) {
            // 计算进位 (只记录撞车的位置，并左移一位)
            int carry = (dataA & dataB) << 1;

            // 计算本位 (无进位和)
            dataA = dataA ^ dataB;

            // 下一轮任务：把进位加到本位上
            dataB = carry;
        }
        return dataA;
    }
}