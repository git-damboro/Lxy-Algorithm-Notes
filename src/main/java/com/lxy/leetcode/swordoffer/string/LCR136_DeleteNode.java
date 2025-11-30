package com.lxy.leetcode.swordoffer.linkedlist;

import com.lxy.leetcode.common.ListNode;

/**
 * LCR 136. 删除链表的节点
 * <p>
 * 核心考点：链表遍历 / 伪头节点
 * 思路：
 * 利用 dummy 节点处理删除头节点的特殊情况。
 * 找到目标节点的前驱节点 (pre)，让 pre.next = cur.next。
 */
public class LCR136_DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}