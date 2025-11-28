# 🚀 Algorithm Journey (算法进阶之路)

> **Keep coding, stay hungry.**
> 记录我攻克 LeetCode 和《剑指 Offer》的刷题历程。
> 重点关注：算法思维、代码规范以及 Java 底层实现。

## 🛠 技术栈 (Tech Stack)
- **Language:** Java 8+
- **Tool:** IntelliJ IDEA
- **Topics:** 数据结构、递归回溯、动态规划、位运算、双指针等。

## 📚 刷题进度 (Solutions)

| 编号 | 题目名称 | 核心考点 | 难度 | 题解代码 |
| :--- | :--- | :--- | :--- | :--- |
| LCR 133 | 位 1 的个数 | 位运算技巧 `n&(n-1)` | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/LCR133_HammingWeight.java) |
| LCR 190 | 加密运算 (不用加减做加法) | 计算机底层加法 (`^`, `&`) | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/LCR190_EncryptionCalculate.java) |
| LCR 134 | Pow(x, n) (数值的整数次方) | 快速幂 (二分法) | 中等 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/LCR134_MyPow.java) |
| LCR 123 | 图书整理 I (倒序打印链表) | 栈 / 递归 | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/stackqueue/LCR123_ReversePrint.java) |
| LCR 125 | 用两个栈实现队列 | 栈与队列 | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/stackqueue/LCR125_CQueue.java) |
| LCR 124 | 推理二叉树 (重建二叉树) | 递归, 分治 | 中等 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/tree/LCR124_DeduceTree.java) |
| LCR 140 | 训练计划 II (倒数第k个节点) | 双指针 (快慢) | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/linkedlist/LCR140_TrainingPlanII.java) |
| LCR 142 | 训练计划 IV (合并两个排序链表) | 伪头节点 | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/linkedlist/LCR142_TrainingPlanIV.java) |
| LCR 135 | 报数 | 数组 | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/array/LCR135_CountNumbers.java) |
| LCR 139 | 训练计划 I (奇偶排序) | 双指针 (首尾) | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/array/LCR139_TrainingPlanI.java) |
| LCR 126 | 斐波那契数 | 动态规划 (滚动数组) | 简单 | [查看代码](./src/main/java/com/lxy/leetcode/swordoffer/dp/LCR126_Fibonacci.java) |
*(更多历史题目整理中...)*

## 💡 核心知识笔记 (Learning Notes)

### 1. 位运算 (Bit Manipulation)
位运算是计算机底层的语言，掌握它可以写出极其高效的代码。

- **消除二进制中最后一个 1**：
    - 公式：`n = n & (n - 1)`
    - 应用：统计二进制中 1 的个数，判断是否为 2 的幂。

- **计算机加法原理**：
    - **异或 (`^`)**：相当于“无进位加法”（1+1=0, 1+0=1）。
    - **与 (`&`) + 左移 (`<<`)**：相当于“计算进位”。
    - 循环直到进位为 0。

- **快速幂 (Binary Exponentiation)**：
    - 将 $x^n$ 的计算复杂度从 $O(N)$ 降至 $O(\log N)$。
    - 核心思想是利用二进制拆分指数，让底数不断翻倍（$x \to x^2 \to x^4$）。
    - 从大到小，体会分治思想，如果指数是偶数，则结果为 $x^n = x^{n/2} * x^{n/2}$；如果指数是奇数，则结果为 $x^n = x^{n/2} * x^{n/2} * x$。
---
*Created by Lxy | Last Update: 2025-11-28*