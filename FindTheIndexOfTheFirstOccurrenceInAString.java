
/*
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 
    if needle is not part of haystack.
*/

// Time: 1m:45s

class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}