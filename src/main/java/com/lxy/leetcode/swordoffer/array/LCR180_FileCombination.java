package com.lxy.leetcode.swordoffer.array;

import java.util.ArrayList;
import java.util.List;

/**
 * LCR 180. 文件组合 (原题：和为s的连续正数序列)
 * <p>
 * 核心考点：滑动窗口 (Sliding Window)
 * 思路：
 * 维护一个窗口 [i, j]，计算窗口内的和 sum。
 * sum < target -> j 右移扩张
 * sum > target -> i 右移收缩
 * sum == target -> 记录答案，并 i 右移打破平衡继续找
 */
public class LCR180_FileCombination {
    public int[][] fileCombination(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1, j = 2, sum = 3;

        while (i < j) {
            if (sum == target) {
                int[] path = new int[j - i + 1];
                for (int k = 0; k < path.length; k++) path[k] = i + k;
                res.add(path);
                sum -= i;
                i++;
            } else if (sum < target) {
                j++;
                sum += j;
            } else {
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}