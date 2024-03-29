/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 *
 * https://leetcode-cn.com/problems/climbing-stairs/description/
 *
 * algorithms
 * Easy (46.47%)
 * Likes:    601
 * Dislikes: 0
 * Total Accepted:    72.9K
 * Total Submissions: 156.7K
 * Testcase Example:  '2'
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 
 * 注意：给定 n 是一个正整数。
 * 
 * 示例 1：
 * 
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 
 * 示例 2：
 * 
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * 
 * 
 */
class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] nums = new int[n + 1];

        nums[1] = 1;
        nums[2] = 2;
        climb(nums, n);
        return nums[n];
    }

    private void climb(int[] nums, int n) {
        int x = n - 1;
        int y = n - 2;

        if (x > 2 && nums[x] == 0) {
            climb(nums, x);
        }
        if (y > 2 && nums[y] == 0) {
            climb(nums, y);
        }
        nums[n] = nums[x] + nums[y];
    }
}

