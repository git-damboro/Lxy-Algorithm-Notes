package com.lxy.leetcode.swordoffer.string;

import java.util.HashMap;
import java.util.Map;

/**
 * LCR 167. 招式拆解 I (原题：最长不含重复字符的子字符串)
 * <p>
 * 核心考点：滑动窗口 + 哈希表
 * 思路：
 * 1. 使用 Map 记录字符上一次出现的索引。
 * 2. 如果遇到重复字符 (Map中存在且位置 >= i)，更新左边界 i。
 * 3. 这里的 i 是左边界的前一个位置，所以长度 = j - i。
 */
public class LCR167_DismantlingAction {
    public int dismantlingAction(String arr) {
        Map<Character, Integer> map = new HashMap<>();
        int i = -1, maxLen = 0;

        for (int j = 0; j < arr.length(); j++) {
            char c = arr.charAt(j);
            if (map.containsKey(c)) {
                // 左边界只能向右走，不能回头
                i = Math.max(i, map.get(c));
            }
            map.put(c, j);
            maxLen = Math.max(maxLen, j - i);
        }
        return maxLen;
    }
}