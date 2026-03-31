class Solution {
    public boolean isValidSudoku(char[][] board) {
        // maps the row index and col indexes to sets to count the numbers
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        // represents each box as a index to a hash set to count the boxes
        HashMap<String, HashSet<Character>> boxes = new HashMap<>();

        // loops through rows
        for(int i = 0; i < board.length; i++){
            // loops through columns
            for(int j = 0; j < board[0].length; j++){
                // ignores the blank spaces
                if(board[i][j] != '.'){
                    // maps from square index to box index
                    String boxesKey = (i/3) + "," + (j/3);

                    // sees if there have been any duplicates and returns false if so
                    if(rows.computeIfAbsent(i, k -> new HashSet<Character>()).contains(board[i][j]) ||
                       cols.computeIfAbsent(j, k -> new HashSet<Character>()).contains(board[i][j]) ||
                       boxes.computeIfAbsent(boxesKey, k -> new HashSet<Character>()).contains(board[i][j])){
                        return false;
                    }

                    // adds the new number to each of the hash maps
                    rows.get(i).add(board[i][j]);
                    cols.get(j).add(board[i][j]);
                    boxes.get(boxesKey).add(board[i][j]);
                }
            }
        }

        // if no duplicates found then it is valid
        return true;
    }
}
