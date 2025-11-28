package com.lxy.leetcode.swordoffer.sort;

import java.util.PriorityQueue;

/**
 * LCR 159. 库存管理 III (最小的 k 个数)
 * 核心考点：堆 (PriorityQueue) / Top K 问题
 */
public class LCR159_GetLeastNumbers {
    public int[] inventoryManagement(int[] stock, int cnt) {
        if (cnt == 0) return new int[0];
        // 大根堆
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : stock) {
            if (pq.size() < cnt) pq.offer(num);
            else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }
        int[] res = new int[cnt];
        for (int i = 0; i < cnt; i++) res[i] = pq.poll();
        return res;
    }
}