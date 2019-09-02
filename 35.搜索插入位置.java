/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 *
 * https://leetcode-cn.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (43.94%)
 * Likes:    296
 * Dislikes: 0
 * Total Accepted:    63.1K
 * Total Submissions: 143.5K
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 * 你可以假设数组中无重复元素。
 * 
 * 示例 1:
 * 
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 
 * 
 * 示例 2:
 * 
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 
 * 
 * 示例 3:
 * 
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 
 * 
 * 示例 4:
 * 
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * 
 * 
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        int begin = 0;
        int end = nums.length - 1;
        int point = nums.length / 2;

        while (point > begin && point < end) {
            if (nums[point] == target) {
                return point;
            } else if (nums[point] > target) {
                end = point;
                point -= (point - begin) / 2;
            } else {
                begin = point;
                point += (end - point) / 2 + 1;
            }
        }
        if (nums[point] == target) {
            return point;
        } else if (target > nums[point]) {
            return point + 1;
        } else {
            if (point != 0) {
                if (target <= nums[point - 1]) {
                    return point - 1;
                }
            }
            return point;
        }
    }
}

