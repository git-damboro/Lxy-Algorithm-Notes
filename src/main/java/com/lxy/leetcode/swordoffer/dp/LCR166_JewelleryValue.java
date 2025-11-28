package com.lxy.leetcode.swordoffer.dp;

/**
 * LCR 166. 珠宝的最高价值
 * 核心考点：二维 DP
 */
public class LCR166_JewelleryValue {
    public int jewelleryValue(int[][] frame) {
        int n = frame.length, m = frame[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i == 0 && j == 0) continue;
                if(i == 0) frame[i][j] += frame[i][j-1];
                else if(j == 0) frame[i][j] += frame[i-1][j];
                else frame[i][j] += Math.max(frame[i-1][j], frame[i][j-1]);
            }
        }
        return frame[n-1][m-1];
    }
}