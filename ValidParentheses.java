/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
    determine if the input string is valid. An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

*/

class Solution {
    public boolean isValid(String s) {

        //take care of odd length strings
        if(s.length() % 2 == 1) return false;

        // FIFO First In First Out 
        // LIFO last In Last Out <-- Use this

        Stack<Character> list = new Stack<>();

        for(Character c : s.toCharArray()) {
            // check to see if there is a closer and add to list if true
            if(c == '(' || c == '{' || c == '[') {
                list.push(c);
            } 
            // check to see if there is a closer
            else if(!list.empty()){
                Character f = list.pop();
                if(c == ')' && f == '(' ||
                    c == '}' && f == '{' ||
                    c == ']' && f == '[') {
                        continue;
                    }
                return false;
            } else {
                return false;
            }
        }
        // will only happen if conditional for closure char is false
        if(list.empty()) {
            return true;
        }
        return false;
        
    }
}
