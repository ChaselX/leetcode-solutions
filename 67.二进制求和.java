/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode-cn.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (50.04%)
 * Likes:    236
 * Dislikes: 0
 * Total Accepted:    35.6K
 * Total Submissions: 71K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 
 * 示例 2:
 * 
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder resBuilder = new StringBuilder();

        int endA = a.length() - 1;
        int endB = b.length() - 1;
        int na, nb, sum;
        int flag = 0;
        while (endA >= 0 || endB >= 0) {
            na = endA >= 0 ? a.charAt(endA--) - '0' : 0;
            nb = endB >= 0 ? b.charAt(endB--) - '0' : 0;
            sum = na + nb + flag;
            resBuilder.append(sum % 2);
            flag = sum / 2;
        }
        return flag == 1 ? resBuilder.append('1').reverse().toString() : resBuilder.reverse().toString();
    }
}

