package com.lxy.leetcode.swordoffer.linkedlist;

import com.lxy.leetcode.common.ListNode;

/**
 * LCR 140. 训练计划 II (原题：链表中倒数第k个节点)
 * <p>
 * 题目描述：
 * 输入一个链表，输出该链表中倒数第 cnt 个节点。
 * <p>
 * 核心考点：双指针 (快慢指针)
 * 思路：
 * 1. 快指针先走 cnt 步。
 * 2. 快慢指针同时走，直到快指针走到头。
 * 3. 此时慢指针就在倒数第 cnt 个位置。
 */
public class LCR140_TrainingPlanII {
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode fast = head, slow = head;
        // 快指针先走
        for (int i = 0; i < cnt; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        // 一起走
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}