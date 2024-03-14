//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private static boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid defines a grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public static void validClear(boolean[][] grid) {
		int r = grid.length;
		int c = grid[0].length;
		boolean validFirstMove = true;
		for(int i=0; i<r; ++i) {
			if(!grid[i][0]) {
				validFirstMove = false;
				break;
			}
		}
		if(validFirstMove) {
			for(int i=1; i<r; ++i) {
				for(int j=1; j<c-1; ++j) {
					grid[i-1][j-1] = grid[i][j];
				}
			}
			for(int i=1; i<r; ++i) {
				grid[i][c-1] = false;
			}
		}
	}
	public static void clearRows(boolean[][] grid) {
		int r = grid.length;
		int c = grid[0].length;
		validClear(grid);
		for (int i = 0; i < r; ++i) {
			boolean check = true;
			if (!grid[i][0]) {
				for (int j = 1; j < c; ++j) {
					if(grid[i][j] && check) {
						grid[i][j]=false;
						grid[i][0]=true;
						check = false;
					}
				}
			}
		}
		validClear(grid);
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	public static boolean[][] getGrid(boolean[][] grid) {
		boolean[][] x = clearRows(grid);
		return x;
	}
}
