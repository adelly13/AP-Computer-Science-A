public class test {
    public static void main (String[] args) {
        System.out.println(numOfInt(30000007));
        System.out.println(reverse("Hello"));
    }

    public static int numOfInt (int n) {
        if (n < 10) {
            return 1;
        }
        return numOfInt(n / 10) + 1;
    }

    public static String reverse (String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    
    
}