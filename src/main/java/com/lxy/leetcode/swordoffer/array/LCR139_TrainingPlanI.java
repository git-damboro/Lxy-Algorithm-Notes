package com.lxy.leetcode.swordoffer.array;

/**
 * LCR 139. 训练计划 I (原题：调整数组顺序使奇数位于偶数前面)
 * <p>
 * 题目描述：
 * 将所有奇数调整至偶数之前。
 * <p>
 * 核心考点：双指针 (首尾碰撞)
 * 思路：
 * 左指针找偶数，右指针找奇数，找到后交换，直到相遇。
 */
public class LCR139_TrainingPlanI {
    public int[] trainingPlan(int[] actions) {
        int i = 0, j = actions.length - 1;
        while (i < j) {
            // 左找偶数
            while (i < j && (actions[i] & 1) == 1) i++;
            // 右找奇数
            while (i < j && (actions[j] & 1) == 0) j--;

            // 交换
            int temp = actions[i];
            actions[i] = actions[j];
            actions[j] = temp;
        }
        return actions;
    }
}