package com.lxy.leetcode.swordoffer.array;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1. 两数之和
 * 核心考点：哈希表 (HashMap)
 * 思路：用 Map 记录已经遍历过的数字和下标，每次查找 target - current 是否存在。
 * 时间复杂度：O(N)
 */
public class LC1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}