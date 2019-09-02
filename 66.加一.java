import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 *
 * https://leetcode-cn.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (40.34%)
 * Likes:    328
 * Dislikes: 0
 * Total Accepted:    70.5K
 * Total Submissions: 174.5K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * 
 * 
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;

        int cur = digits[end];
        if (++cur != 10) {
            digits[end] = cur;
            return digits;
        }
        digits[end] = 0;
        for (int i = end - 1; i >= 0; i--) {
            cur = digits[i];
            if (++cur != 10) {
                digits[i] = cur;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];

        newDigits[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            newDigits[i + 1] = digits[i];
        }
        return newDigits;
    }
}

