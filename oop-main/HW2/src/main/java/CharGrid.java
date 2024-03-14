// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private static char[][] grid;

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public CharGrid(char[][] grid) { this.grid = grid;
    }

    public static int validLength(int[] a,int n) {
        int mini=a[0];
        int maxi=a[0];
        for(int i=0; i<n; ++i) {
            if(a[i]<mini)
                mini=a[i];
            if(a[i]>maxi)
                maxi=a[i];
        }
        return maxi-mini+1;
    }
    /**
     * Returns the area for the given char in the grid. (see handout).
     *
     * @param ch to look for
     * @return area for given char
     */
    public static int charArea(char[][] grid,char ch) {
        int r = grid.length;
        int c = grid[0].length;
        int[] row = new int[r*c];
        int[] column = new int[r*c];
        int a = 0;
        int counter = 0;
        for(int i=0; i<r; ++i) {
            for(int j=0; j<c; ++j) {
                if(grid[i][j] == ch) {
                    row[a] = i;
                    column[a] = j;
                    ++a;
                    ++ counter;
                }
            }
        }
        if(counter>1) {
            int height = validLength(row, counter);
            int width = validLength(column, counter);
            return height*width;
        } else {
            return counter;
        }
    }

    private static final int[][] Directions = {{1,0},{-1,0},{0,1},{0,-1}};

    /**
     * Returns the count of '+' figures in the grid (see handout).
     *
     * @return number of + in grid
     */
    public int countPlus(char[][] grid) {

        return 1;
    }
}
