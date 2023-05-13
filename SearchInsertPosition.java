/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found. 
    If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
*/

// Time: 9m:48s


class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //start the target at index 0
        int inserted = 0;

        // iterate through the nums array
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            // requirement: target can be a negative number
            if(target > nums[i]) {
                //increase the index by 1
                inserted++;
            }

        }

        //return the inserted index/counter if the target was not found in nums array
        return inserted;

    }
}