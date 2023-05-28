/*
    Given two binary strings a and b, return their sum as a binary string.
*/

class Solution {
    public String addBinary(String a, String b) {
        
        // ans to return
        String ans = "";
        // this is technically 0
        boolean hold = false;
        // make a or b the same size
        String[] nums = convertSize(a, b);

        //re-assigning the paramters
        
        // iterate through both a and b in reverse order
        for(int i = nums[0].length() - 1; i >= 0; i--) {

            //check for 0, 1, and 2
            
        }
        return nums[1];
    }

    /*
        @params:
            String : a
            String : b
        @return:
            converted a and b
    */
    public String[] convertSize(String a, String b) {
        // get the difference of the 2 Strings
        int difference = Math.abs(Integer.parseInt(a) - Integer.parseInt(b));
        
        // was going to return without max but I need it in order to determine what variable to return (a or b)
        String max = a.length() > b.length() ? a : b;

        // must only convert the String that has the minimum len
        String min = a.length() < b.length() ? a : b;

        //added 0s
        for(int i = 0; i < difference; i++) {
            min = "0" + min;
        }

        String arr[] = {max, min};
        return arr;
    }
}