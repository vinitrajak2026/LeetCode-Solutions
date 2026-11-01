import java.util.*;
class Solution {
public List<List<String>> solveNQueens(int n) {
List<List<String>> result = new ArrayList<>();
    char[][] board = new char[n][n];
    for (char[] row : board) {
        Arrays.fill(row, '.');
    }

    boolean[] col = new boolean[n];
    boolean[] diagonal1 = new boolean[2 * n - 1];
    boolean[] diagonal2 = new boolean[2 * n - 1];

    solve(0, n, board, col, diagonal1, diagonal2, result);

    return result;
}

private void solve(int row, int n, char[][] board,
                   boolean[] col, boolean[] diagonal1,
                   boolean[] diagonal2,
                   List<List<String>> result) {

    if (row == n) {
        List<String> solution = new ArrayList<>();

        for (char[] r : board) {
            solution.add(new String(r));
        }

        result.add(solution);
        return;
    }

    for (int c = 0; c < n; c++) {
        int d1 = row - c + n - 1;
        int d2 = row + c;

        if (col[c] || diagonal1[d1] || diagonal2[d2]) {
            continue;
        }

        board[row][c] = 'Q';
        col[c] = true;
        diagonal1[d1] = true;
        diagonal2[d2] = true;

        solve(row + 1, n, board, col, diagonal1, diagonal2, result);

        board[row][c] = '.';
        col[c] = false;
        diagonal1[d1] = false;
        diagonal2[d2] = false;
    }
}
}
