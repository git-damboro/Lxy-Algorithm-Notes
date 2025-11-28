package com.lxy.leetcode.swordoffer.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * LCR 125. 图书整理 II (原题：用两个栈实现队列)
 * <p>
 * 题目描述：
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead。
 * <p>
 * 核心考点：栈与队列的转换 / 懒惰搬运
 * 思路：
 * 1. inStack 负责进，outStack 负责出。
 * 2. 入队：直接压入 inStack。
 * 3. 出队：如果 outStack 有货直接弹；没货则把 inStack 全部倒入 outStack 再弹。
 */
public class LCR125_CQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public LCR125_CQueue() {
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        // 如果出货口是空的，需要进货
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) return -1;
            // 倒腾数据
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}