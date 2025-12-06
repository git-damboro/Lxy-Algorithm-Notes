package com.lxy.leetcode.swordoffer.array;

import java.util.HashSet;
import java.util.Set;

/**
 * LCR 186. 文物朝代判断 (原题：扑克牌中的顺子)
 * <p>
 * 核心考点：逻辑分析 / Set 去重
 * 思路：
 * 满足两个条件即为顺子：
 * 1. 除 0 外没有重复数字 (Set 查重)。
 * 2. max - min < 5 (跨度在 5 以内)。
 */
public class LCR186_CheckDynasty {
    public boolean checkDynasty(int[] places) {
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int num : places) {
            if (num == 0) continue;
            if (set.contains(num)) return false; // 有对子，失败
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min < 5;
    }
}