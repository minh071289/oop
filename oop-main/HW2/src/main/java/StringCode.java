// CS108 HW1 -- String static methods
import java.util.HashSet;

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     *
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int res = 0;
        int counter = 1;

        if (str.length() != 0) {
            for (int i = 0; i < str.length() - 1; ++i) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    ++counter;
                } else {
                    counter = 1;
                }
                res = Math.max(counter, res);
            }
        }
        return res;
    }

    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     *
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        String s = "";
        if (str.length() != 0) {
            for (int i = 0; i < str.length() - 1; ++i) {
                char Char = str.charAt(i);
                if (Character.isDigit(Char)) {
                    int t = Char - '0';
                    for (int j = 0; j < t; ++j)
                        s += str.charAt(i + 1);
                } else {
                    s += str.charAt(i);
                }
            }
            char n = str.charAt(str.length() - 1);
            if (!Character.isDigit(n))
                s += n;
        }
        return s;
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        if(a==null || b==null || len==0)
            return false;
        HashSet<String> x = new HashSet<>();

        for(int i=0; i<=a.length()-len; ++i) {
            x.add(a.substring(i,i+len));
        }
        for(int i=0; i<=b.length()-len; ++i) {
            if(x.contains(b.substring(i,i+len)))
                return true;
        }
        return false;
    }
}
