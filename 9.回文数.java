/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 *
 * https://leetcode-cn.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (56.44%)
 * Likes:    678
 * Dislikes: 0
 * Total Accepted:    140.7K
 * Total Submissions: 249.2K
 * Testcase Example:  '121'
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 示例 1:
 * 
 * 输入: 121
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 
 * 
 * 示例 3:
 * 
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 
 * 
 * 进阶:
 * 
 * 你能不将整数转为字符串来解决这个问题吗？
 * 
 */
class Solution {
    public boolean isPalindrome(int x) {
        final int origin = x;
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }
        int temp = 0;
        while (x != 0) {
            int n = x % 10;
            temp = temp * 10 + n;
            x /= 10;
        }
        if (temp == origin) {
            return true;
        }
        return false;
    }
}

