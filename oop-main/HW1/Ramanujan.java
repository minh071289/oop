public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i < Math.sqrt(n); ++i) {
            for (int j = i; j < Math.sqrt(n); ++j) {
                for (int q = i + 1; q < Math.sqrt(n); ++q) {
                    for (int k = q; k < Math.sqrt(n); ++k) {
                        int a = i * i * i;
                        int b = j * j * j;
                        int c = q * q * q;
                        int d = k * k * k;
                        int x = a + b;
                        int y = c + d;
                        if (x==y && x<=n) {
                            System.out.println(x+" = "+i+"^3"+" + "+j+"^3"+" = "+q+"^3"+" + "+k+"^3");
                        }
                    }
                }
            }
        }
    }
}
