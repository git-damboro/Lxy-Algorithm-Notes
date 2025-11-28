package com.lxy.leetcode.swordoffer.array;

/**
 * LCR 120. 寻找文件副本 (原题：数组中重复的数字)
 * 核心考点：原地哈希 (In-place Swap)
 * 思路：利用下标和值的映射关系，把 nums[i] 放到下标 i 的位置。
 * 时间复杂度：O(N), 空间复杂度：O(1)
 */
public class LCR120_FindRepeatNumber {
    public int findRepeatDocument(int[] documents) {
        for (int i = 0; i < documents.length; i++) {
            // 只要当前位置不对，就一直交换
            while (documents[i] != i) {
                // 如果目标位置已经有了正确的值，说明重复了
                if (documents[i] == documents[documents[i]]) {
                    return documents[i];
                }
                // 交换
                int temp = documents[i];
                documents[i] = documents[temp];
                documents[temp] = temp;
            }
        }
        return -1;
    }
}