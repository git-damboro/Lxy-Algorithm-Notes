package com.lxy.leetcode.swordoffer.stackqueue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * LC 20. 有效的括号
 * 核心考点：栈 (Stack)
 * 思路：遇到左括号入栈，遇到右括号出栈匹配。
 */
public class LC20_ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) { // 如果是右括号
                // 栈为空 或 弹出的左括号不匹配 -> 失败
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else { // 如果是左括号
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}