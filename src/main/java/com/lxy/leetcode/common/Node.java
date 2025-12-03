package com.lxy.leetcode.common;

// 专门用于 LCR 154 (复杂链表) 的节点类
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}