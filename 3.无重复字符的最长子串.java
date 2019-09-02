import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (30.57%)
 * Likes:    2132
 * Dislikes: 0
 * Total Accepted:    171K
 * Total Submissions: 558.8K
 * Testcase Example:  '"abcabcbb"'
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1:
 * 
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 
 * 
 * 示例 3:
 * 
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 
 * 
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        char begin;
        int len, index, endPoint;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> chMap = new HashMap<>();
            len = 1;
            begin = s.charAt(i);
            chMap.put(begin, 1);
            index = s.indexOf(begin, i + 1);
            endPoint = index > 0 ? index : s.length();
            for (int j = i + 1; j < endPoint; j++) {
                char cur = s.charAt(j);
                Integer count = chMap.get(cur);
                if (Objects.nonNull(count)) {
                    break;
                } else {
                    chMap.put(cur, 1);
                    len++;
                }
            }
            maxLen = len > maxLen ? len : maxLen;
        }
        return maxLen;
    }
}

