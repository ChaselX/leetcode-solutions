/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (56.15%)
 * Likes:    562
 * Dislikes: 0
 * Total Accepted:    94.2K
 * Total Submissions: 167.5K
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // 还可以写成递归调用
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList, current;
        int val1, val2;
        if (l1 != null && l2 != null) {
            val1 = l1.val;
            val2 = l2.val;
            if (val1 < val2) {
                newList = new ListNode(val1);
                l1 = l1.next;
            } else {
                newList = new ListNode(val2);
                l2 = l2.next;
            }
        } else if (l1 == null) {
            newList = l2;
            return newList;
        } else if (l2 == null) {
            newList = l1;
            return newList;
        } else {
            return null;
        }
        current = newList;
        while (l1 != null && l2 != null) {
            val1 = l1.val;
            val2 = l2.val;
            if (val1 < val2) {
                current.next = new ListNode(val1);
                l1 = l1.next;
            } else {
                current.next = new ListNode(val2);
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null || l2 != null) {
            if (l1 == null) {
                current.next = l2;
            } else {
                current.next = l1;
            }
        }
        return newList;
    }
}

