public class Transpose {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j)
                a[i][j] = n*i+j+1;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i+1; j < n; ++j) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
}
