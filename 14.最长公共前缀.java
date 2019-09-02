import com.sun.org.apache.regexp.internal.recompile;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (34.25%)
 * Likes:    640
 * Dislikes: 0
 * Total Accepted:    105.6K
 * Total Submissions: 307.4K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefixBuilder = new StringBuilder("");
        if(strs == null || strs.length ==0){
            return "";
        }

        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            final char ch = first.charAt(i);
            boolean checked = true;
            for (int j = 1; j < strs.length; j++) {
                String tmp = strs[j];
                if (tmp.length() == i || tmp.charAt(i) != ch) {
                    checked = false;
                    break;
                }
            }
            if (checked) {
                prefixBuilder.append(ch);
            } else {
                break;
            }
        }
        return prefixBuilder.toString();
    }
}

