package com.lxy.leetcode.swordoffer.string;

/**
 * LCR 181. 字符串中的单词反转
 * <p>
 * 核心考点：字符串基础操作 / 双指针
 * 思路：
 * 1. 使用 trim() 去除首尾空格。
 * 2. 使用 split("\\s+") 正则分割单词。
 * 3. 倒序遍历数组，用 StringBuilder 拼接。
 */
public class LCR181_ReverseMessage {
    public String reverseMessage(String message) {
        message = message.trim();
        // 正则 \\s+ 表示匹配一个或多个空格
        String[] words = message.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}