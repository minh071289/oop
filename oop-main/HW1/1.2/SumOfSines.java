public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double r = Math.toRadians(t);
        double s = Math.sin(2*r) + Math.sin(3*r);
        System.out.println(s);
    }
}
