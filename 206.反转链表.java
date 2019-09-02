/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        ListNode tmp;
        while(current!=null){
            tmp = current.next;
            current.next = pre;
            pre = current;
            current = tmp;
        }
        return pre;
    }
}

