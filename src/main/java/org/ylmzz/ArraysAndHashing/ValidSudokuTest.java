package org.ylmzz.ArraysAndHashing;

import java.util.*;

public class ValidSudokuTest {
    public static void run()
    {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.printf("Input: board = %s\n", Arrays.deepToString(board));
        System.out.printf("Output: %b", isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board)
    {
        var cols = new HashSet<>();
        var rows = new HashSet<>();
        Set<String> squares = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rows.contains(board[i][j]))
                        return false;
                    rows.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (cols.contains(board[j][i]))
                        return false;
                    cols.add(board[j][i]);
                }
                if (board[i][j] != '.') {
                    var tempKey = board[i][j] + "-" + i / 3 + "-" + j / 3;
                    if (squares.contains(tempKey)) return false;
                    squares.add(tempKey);
                }
            }
            rows.clear();
            cols.clear();
        }
        return true;
    }
}
