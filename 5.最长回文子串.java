import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 *
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (26.29%)
 * Likes:    1083
 * Dislikes: 0
 * Total Accepted:    83.3K
 * Total Submissions: 316.2K
 * Testcase Example:  '"babad"'
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 
 * 示例 1：
 * 
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 
 * 
 * 示例 2：
 * 
 * 输入: "cbbd"
 * 输出: "bb"
 * 
 * 
 */
class Solution {
    /**
     * dp[j][i] = | true, i==j
     *            | str[i]==str[j], i-j==1
     *            | str[i]==str[j] && dp[j+1][i-1], i-j>1
     */
    public String longestPalindrome(String s) {
        final int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j < 2) {
                    dp[j][i] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[j][i] = (s.charAt(i) == s.charAt(j)) && dp[j + 1][i - 1];
                }
                if (dp[j][i] && maxLen < i - j + 1) {
                    maxLen = i - j + 1;
                    start = j;
                }
            }
        }
        return s.substring(start,start + maxLen);
    }
}
