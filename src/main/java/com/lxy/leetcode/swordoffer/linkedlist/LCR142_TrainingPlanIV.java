package com.lxy.leetcode.swordoffer.linkedlist;

import com.lxy.leetcode.common.ListNode;

/**
 * LCR 142. 训练计划 IV (原题：合并两个排序的链表)
 * <p>
 * 题目描述：
 * 输入两个递增排序的链表，合并成一个新的递增链表。
 * <p>
 * 核心考点：伪头节点 (Dummy Node) / 双指针
 * 思路：
 * 创建一个 dummy 节点，比较 l1 和 l2 的值，谁小就把谁接在 dummy 后面。
 */
public class LCR142_TrainingPlanIV {
    public ListNode trainingPlan(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        // 接上剩余部分
        cur.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}