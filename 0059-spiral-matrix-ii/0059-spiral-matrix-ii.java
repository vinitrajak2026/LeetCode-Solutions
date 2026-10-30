class Solution {
public int[][] generateMatrix(int n) {
    int[][] mat = new int[n][n];
    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};

    int r = 0;
    int c = 0;
    int dir = 0;

    boolean[][] vis = new boolean[n][n];

    for (int num = 1; num <= n * n; num++)
     {

        mat[r][c] = num;
        vis[r][c] = true;

        int nxtrow = r + dr[dir];
        int nxtcol = c + dc[dir];

        if (nxtrow < 0 || nxtrow >= n ||
            nxtcol < 0 || nxtcol >= n ||
            vis[nxtrow][nxtcol]) {

            dir = (dir + 1) % 4;

            nxtrow = r + dr[dir];
            nxtcol = c + dc[dir];
        }

        if (num < n * n) {
            r = nxtrow;
            c = nxtcol;
        }
    }

    return mat;
}
}
