package com.lxy.leetcode.swordoffer.tree;

// 注意：这里不要 import com.lxy.leetcode.common.Node;
// 我们使用文件底部定义的内部 Node 类

/**
 * LCR 155. 将二叉搜索树转化为排序的双向链表
 */
public class LCR155_TreeToDoublyList {
    // 这里使用的 Node 是下面定义的那个，不是 common 包里的
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);

        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(Node cur) {
        if(cur == null) return;

        dfs(cur.left);

        if (pre != null) pre.right = cur;
        else head = cur;

        cur.left = pre;
        pre = cur;

        dfs(cur.right);
    }

    // ==========================================
    // 专用内部类：只为这就题服务
    // ==========================================
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}