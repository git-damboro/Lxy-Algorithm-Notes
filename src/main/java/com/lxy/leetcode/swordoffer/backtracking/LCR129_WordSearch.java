package com.lxy.leetcode.swordoffer.backtracking;

/**
 * LCR 129. 字母迷宫 (矩阵中的路径)
 * 核心考点：DFS / 状态标记与回溯
 */
public class LCR129_WordSearch {
    public boolean wordPuzzle(char[][] grid, String target) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(dfs(grid, target, i, j, 0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] grid, String target, int i, int j, int k) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != target.charAt(k)) return false;
        if(k == target.length() - 1) return true;

        grid[i][j] = '\0'; // 标记已走过
        boolean res = dfs(grid, target, i + 1, j, k + 1) ||
                dfs(grid, target, i - 1, j, k + 1) ||
                dfs(grid, target, i, j + 1, k + 1) ||
                dfs(grid, target, i, j - 1, k + 1);
        grid[i][j] = target.charAt(k); // 恢复现场
        return res;
    }
}