package com.lxy.leetcode.swordoffer.string;

import java.util.HashMap;
import java.util.Map;

/**
 * LCR 169. 招式拆解 II (原题：第一个只出现一次的字符)
 * <p>
 * 核心考点：哈希表 / 两次遍历
 * 思路：
 * 1. 第一次遍历：统计每个字符的出现次数 (或使用 boolean 标记是否重复)。
 * 2. 第二次遍历：按字符串顺序检查，找到第一个次数为 1 的字符。
 */
public class LCR169_DismantlingActionII {
    public char dismantlingAction(String arr) {
        Map<Character, Boolean> map = new HashMap<>();
        char[] sc = arr.toCharArray();
        // 第一次遍历：记录状态
        for (char c : sc) {
            map.put(c, !map.containsKey(c));
        }
        // 第二次遍历：找第一个 true
        for (char c : sc) {
            if (map.get(c)) return c;
        }
        return ' ';
    }
}