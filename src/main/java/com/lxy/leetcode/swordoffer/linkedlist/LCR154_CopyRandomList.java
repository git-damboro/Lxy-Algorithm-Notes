package com.lxy.leetcode.swordoffer.linkedlist;

import com.lxy.leetcode.common.Node; // 引入刚才建的 Node
import java.util.HashMap;
import java.util.Map;

/**
 * LCR 154. 复杂链表的复制 (原题：复杂链表的复制)
 * <p>
 * 核心考点：哈希表 / 深拷贝
 * 思路：
 * 1. 第一次遍历：只创建新节点，并建立 <原节点, 新节点> 的 Map 映射。
 * 2. 第二次遍历：根据 Map 映射，设置新节点的 next 和 random 指针。
 */
public class LCR154_CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Node cur = head;

        // 1. 造人 (Copy Node)
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        // 2. 连线 (Connect)
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}