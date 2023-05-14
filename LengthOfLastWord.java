
/*
    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.
*/

// Time: 14m:39s

class Solution {
    public int lengthOfLastWord(String s) {
        // trim any whitepace at the back of the string
        String word = " " + s.trim();

        // iterate through the word string backwards and stop when a whitespace is encountered
        for(int i = word.length() - 1; i >= 0 ; i--) {

            // I'm at an index that does not count but gives me enough info to tell where I'm at'
            if(word.charAt(i) == ' ') {
                return word.substring(i + 1, word.length()).length();
            }    
        }

        // return the word

        return word.length();
    }
}