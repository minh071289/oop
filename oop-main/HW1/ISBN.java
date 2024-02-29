public class ISBN {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = m;
        int[] a = new int[9];
        int i = 0, sum = 0;
        while (n > 0) {
            a[i] = n % 10;
            sum += (i + 2) * a[i];
            ++i;
            n /= 10;
        }
        if (sum % 11 == 1) {
            System.out.println(m + "X");
        } else if(sum % 11 ==0) {
            System.out.println(m+"0");
        } else {
            int k = 11-sum%11;
            System.out.print(m);
            System.out.print(k);
        }
    }
}
