/*
    Given two binary strings a and b, return their sum as a binary string.
*/

class Solution {
    public String addBinary(String a, String b) {
        
        // ans to return
        String ans = "";
        // this is technically 0
        int hold = 0;
        // make a or b the same size
        String[] nums = convertSize(a, b);
        
        // iterate through both a and b in reverse order
        for(int i = nums[0].length() - 1; i >= 0; i--) {
            // sum the numbers in int form as well as any hold number there is
            int sum = Character.getNumericValue(nums[0].charAt(i)) + 
                        Character.getNumericValue(nums[1].charAt(i)) + 
                        hold;
            // take out the hold number
            hold = 0;
            // check for 0, 1, 2, and 3
            if(sum == 0) {
                ans = "0" + ans;
            } else if(sum == 1) {
                ans = "1" + ans;
            } else if(sum == 2) {
                ans = "0" + ans;
                hold = 1;
            } else if(sum == 3) {
                ans = "1" + ans;
                hold = 1;
            }
            
        }

        if(hold == 1) {
            return "1" + ans;
        }
        
        return ans;
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
        int difference = Math.abs(a.length() - b.length());
        
        // was going to return without max but I need it in order to determine what variable to return (a or b)
        String num1 = a.length() >= b.length() ? a : b;

        // must only convert the String that has the minimum len
        String num2 = a.length() < b.length() ? a : b;

        String temp = "";
        //added 0s
        for(int i = 0; i < difference; i++) {
            temp += "0";
        }

        String arr[] = {num1, temp + num2};
        return arr;
    }
}


