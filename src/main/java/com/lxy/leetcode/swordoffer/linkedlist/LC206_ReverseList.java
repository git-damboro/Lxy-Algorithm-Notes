package com.lxy.leetcode.swordoffer.linkedlist;

import com.lxy.leetcode.common.ListNode; // 引入公用节点

/**
 * LC 206. 反转链表
 * 核心考点：链表指针操作
 * 思路：双指针迭代 (pre, cur, next)，不断改变指针指向。
 * 时间复杂度：O(N)
 */
public class LC206_ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; // 暂存下一步
            curr.next = prev;              // 反转箭头
            prev = curr;                   // prev 前移
            curr = nextTemp;               // curr 前移
        }
        return prev;
    }
}