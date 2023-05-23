/*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith 
    digit of the integer. The digits are ordered from most significant to least significant in left-to-right 
    order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i = digits.length - 1; i >= 0; i--) {

            // digits can only be from 0 - 9
            if(digits[i]  < 9) {
                // add 1 to the last digit and now it's finished counting
                digits[i]++;
                return digits;
            }

            // if it's 9 then make digits[i] = 0 and in the next loop it will add 1 to the next index
            digits[i] = 0;
        }

        // last case scenario, is all array indexes are 9, then the array must progress by one length
        // return a new array and change the first index value to 1. All other values will default to a value of 0
        int arr[] = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
        
    }
}