public class Distance1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double s = Math.sqrt(x*x+y*y);
        System.out.println(s);
    }
} 