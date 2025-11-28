package com.lxy.leetcode.swordoffer.stackqueue;

import com.lxy.leetcode.common.ListNode;
import java.util.Stack;

/**
 * LCR 123. 图书整理 I (原题：从尾到头打印链表)
 * <p>
 * 题目描述：
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 核心考点：栈 (Stack) 的先进后出特性
 * 思路：
 * 链表只能从头到尾遍历，但我们需要倒序输出。
 * 利用栈将所有节点压入，然后再依次弹出，即可实现倒序。
 */
public class LCR123_ReversePrint {
    public int[] reverseBookList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}