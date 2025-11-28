package com.lxy.leetcode.swordoffer.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * LCR 147. 最小栈 (原题：包含 min 函数的栈)
 * <p>
 * 题目描述：
 * 实现一个栈，支持 push, pop, top, min 函数，且复杂度均为 O(1)。
 * <p>
 * 核心考点：辅助栈
 * 思路：
 * 1. 栈 A 存数据。
 * 2. 栈 B (辅助栈) 存当前的最小值 (非严格降序)。
 * 3. 只有当新元素 <= B.peek() 时，才压入 B。
 */
public class LCR147_MinStack {
    Deque<Integer> A;
    Deque<Integer> B;

    public LCR147_MinStack() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public void push(int x) {
        A.push(x);
        // 注意：这里必须用 <=，处理重复最小值的情况
        // 利用短路与防止空指针
        if (B.isEmpty() || x <= B.peek()) {
            B.push(x);
        }
    }

    public void pop() {
        // 注意：对象比较要用 equals
        if (A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }
}