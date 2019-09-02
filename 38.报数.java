/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 *
 * https://leetcode-cn.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (51.56%)
 * Likes:    279
 * Dislikes: 0
 * Total Accepted:    42.1K
 * Total Submissions: 81.3K
 * Testcase Example:  '1'
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * 注意：整数顺序将表示为一个字符串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: 1
 * 输出: "1"
 * 
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "1211"
 * 
 * 
 */
class Solution {

    public String countAndSay(int n) {
        // 循环实现 Runtime 52.99%, Memory 87.1%
        // String pre = "1";

        // int count;
        // char preChar;

        // for (int i = 2; i < n+1; i++) {
        //     StringBuilder builder = new StringBuilder();
        //     int len = pre.length();
        //     preChar = pre.charAt(0);
        //     count = 1;
        //     for (int j = 1; j < len; j++) {
        //         if (pre.charAt(j) == preChar) {
        //             count++;
        //         } else {
        //             builder.append(count).append(preChar);
        //             count = 1;
        //             preChar = pre.charAt(j);
        //         }
        //     }
        //     builder.append(count).append(preChar);
        //     pre = builder.toString();
        // }
        // return pre;
        
        // 递归实现 Runtime 74.91%, Memory 84.62%
        if (n == 1) return "1";

        String preSay = countAndSay(n - 1);
        StringBuilder builder = new StringBuilder();
        char c = preSay.charAt(0);
        int count = 1;
        for (int j = 1; j < preSay.length(); j++) {
            if (c == preSay.charAt(j)) {
                count++;
            } else {
                builder.append(count).append(c);
                count = 1;
                c = preSay.charAt(j);
            }
        }
        builder.append(count).append(c);
        return builder.toString();
    }
}

