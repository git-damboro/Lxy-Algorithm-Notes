package com.lxy.leetcode.swordoffer.backtracking;

import java.util.*;

/**
 * LCR 157. 套餐内商品的排列顺序 (全排列)
 * 核心考点：回溯 / 交换法 / 剪枝去重
 */
public class LCR157_Permutation {
    List<String> res = new ArrayList<>();
    char[] c;
    public String[] goodsOrder(String goods) {
        c = goods.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
    void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) continue; // 剪枝
            set.add(c[i]);
            swap(i, x); // 交换
            dfs(x + 1);
            swap(i, x); // 恢复
        }
    }
    void swap(int a, int b) {
        char tmp = c[a]; c[a] = c[b]; c[b] = tmp;
    }
}