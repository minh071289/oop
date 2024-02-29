public class SumOfTwoDice {
    public static void main(String[] args) {
        int dice = 6;
        int x = 1 + (int) (Math.random() * dice);
        int y = 1 + (int) (Math.random() * dice);
        int sum = x+y;
        System.out.println(sum);
    }
}