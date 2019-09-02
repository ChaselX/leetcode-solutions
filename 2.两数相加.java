import java.util.Objects;

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (35.03%)
 * Likes:    2778
 * Dislikes: 0
 * Total Accepted:    172.4K
 * Total Submissions: 491.9K
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例：
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int v1,v2;
        ListNode head = new ListNode(0);
        ListNode resultNode = head;
        ListNode tmp;
        
        int val = l1.val +l2.val;
        head.val = val%10;
        int incr = val>9?1:0;
        while(Objects.nonNull(l1.next)||Objects.nonNull(l2.next)){
            if(l1.next!=null){
                l1 = l1.next;
                v1= Objects.nonNull(l1)? l1.val: 0;
            } else{
                v1 = 0;
            }
            if(l2.next!=null){
                l2 = l2.next;
                v2= Objects.nonNull(l2)? l2.val: 0;
            } else{
                v2 = 0;
            }

            tmp = new ListNode(0);

            resultNode.next = tmp;
            val = v1 +v2+incr;
            tmp.val = val%10;
            
            incr = val>9?1:0;
            resultNode = tmp;
        }
        if(incr == 1){
            resultNode.next = new ListNode(1);
        }

        return head;
    }
}

