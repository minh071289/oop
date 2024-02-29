public class IntegerToBinaryString {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        String s = "";
        while(x>0){
            int z = x%2;
            s = z + s;
            x=x/2;
        }
        System.out.println(s);
    }
}