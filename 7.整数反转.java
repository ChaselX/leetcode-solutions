import com.sun.jndi.url.iiop.iiopURLContext;

/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (32.73%)
 * Likes:    1198
 * Dislikes: 0
 * Total Accepted:    157.7K
 * Total Submissions: 481.8K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */
class Solution {
    public int reverse(int x) {
        String strX = String.valueOf(x);
        if (strX.length() == 1) {
            return x;
        }
        StringBuilder sb = new StringBuilder(strX.substring(1));
        sb.reverse();
        char ch = strX.charAt(0);
        if (ch == '-') {
            while (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            sb.insert(0, ch);
        } else {
            sb.append(ch);
            while (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
        }
        long result = new Long(sb.toString());
        return (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) ? (int) result : 0;
    }
}

