// Adelina Chau Period 2

import java.util.Scanner;

public class swappingletters {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        for (int it = 0; it < word.length(); it++) {
            int i = (int) (Math.random() * (word.length()-1));
            int jmin = i + 1;
            int j = (int) (Math.random() * ((word.length()-1) - jmin + 1) + jmin);
            String first = word.substring(0, i);
            String second = word.substring(i+1, j);
            String third = word.substring(j+1, word.length());
            // System.out.println(i + " " + j);
            // System.out.println(first + " " + second + " " + third);
            word = first + word.charAt(j) + second + word.charAt(i) + third;
        }
        System.out.println(word);
    }
}