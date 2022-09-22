// Adelina Chau Period 2

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String areaCode = number.substring(0, 3);
        String middleThree = number.substring(3, 6);
        String endFour = number.substring(6, 10);
        String formattedNumber = "(" + areaCode + ")" + middleThree + "-" + endFour;
        System.out.println(formattedNumber);
    }
}
