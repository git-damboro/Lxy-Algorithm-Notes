package com.lxy.leetcode.swordoffer.array;

/**
 * LCR 179. 查找总价格为目标值的两个商品 (原题：和为s的两个数字)
 * <p>
 * 核心考点：双指针 (对撞指针)
 * 思路：
 * 因为数组是有序的，利用首尾双指针。
 * sum > target -> right--
 * sum < target -> left++
 */
public class LCR179_TwoSumSorted {
    public int[] twoSum(int[] price, int target) {
        int i = 0, j = price.length - 1;
        while (i < j) {
            int sum = price[i] + price[j];
            if (sum > target) j--;
            else if (sum < target) i++;
            else return new int[]{price[i], price[j]};
        }
        return new int[0];
    }
}