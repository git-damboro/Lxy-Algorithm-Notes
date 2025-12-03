package com.lxy.leetcode.swordoffer.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * LCR 148. 验证图书取出顺序 (原题：栈的压入、弹出序列)
 * <p>
 * 核心考点：栈的模拟
 * 思路：
 * 模拟入栈过程。每压入一个元素，就循环检查栈顶是否等于当前出栈序列的目标值。
 * 如果相等则弹出，直到栈空或不匹配。
 */
public class LCR148_ValidateStackSequences {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        Deque<Integer> stack = new LinkedList<>();
        int j = 0;
        for (int num : putIn) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == takeOut[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}