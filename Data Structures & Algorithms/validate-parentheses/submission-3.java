class Solution {
    public boolean isValid(String s) {
        // matching parens
        HashMap<Character, Character> closing = new HashMap<>();
        closing.put('[', ']');
        closing.put('(', ')');
        closing.put('{', '}');

        // stack to keep track of order
        Deque<Character> openParens = new ArrayDeque<>();

        // loop through each character
        for(Character c: s.toCharArray()) {
            // Check if the top of the stack is closed by the current char
            if(!openParens.isEmpty() && closing.get(openParens.peek()).equals(c)){
                // remove if it is closed
                openParens.pop();
            } else {
                // if the paren is closing and does not close the top then there is an order mismatch
                if(!closing.containsKey(c)) return false;

                // push if it is still an open paren
                openParens.push(c);
            }
        }

        // if all open parens were cleared from the stack it is valid
        return openParens.isEmpty(); 
    }
}
