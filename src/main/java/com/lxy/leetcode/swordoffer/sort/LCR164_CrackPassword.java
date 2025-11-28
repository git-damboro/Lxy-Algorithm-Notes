package com.lxy.leetcode.swordoffer.sort;

import java.util.Arrays;

/**
 * LCR 164. 破解闯关密码
 * 核心考点：自定义排序
 * 规则：若 x+y < y+x，则 x 排在前面
 */
public class LCR164_CrackPassword {
    public String crackPassword(int[] password) {
        String[] strs = new String[password.length];
        for(int i = 0; i < password.length; i++)
            strs[i] = String.valueOf(password[i]);

        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));

        StringBuilder res = new StringBuilder();
        for(String s : strs) res.append(s);
        return res.toString();
    }
}