
/*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that 
    each unique element appears only once. The relative order of the elements should be kept the same. 
    Then return the number of unique elements in nums.

    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they 
    were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.

*/

// Time: 20 min

class Solution {
    public int removeDuplicates(int[] nums) {
        
        // will count the index of those that have not been counted
        int counted = 0;

        //
        for(int i = 1; i < nums.length; i++) {

            // checking that the outside index doesn't match that of nums[index]
            if(nums[counted] != nums[i]) {
                // going to the next index
                counted++;
                
                // since the nums[i] is now counted, I can switch the nums to the last unique value
                nums[counted] = nums[i];
            }
        }

        // added one because of the first index being empty 
        return ++counted;
    }
}