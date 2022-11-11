import java.util.Scanner;

public class creditcard {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        String newnumber = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '-') {
                newnumber += number.charAt(i);
            }
        }
        System.out.println(newnumber);
    }
}