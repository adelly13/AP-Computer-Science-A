public class streak {
    public static void main (String[] args) {
        longestStreak("CCAAAATTTTTTT!");
    }

    public static void longestStreak(String str) {
        int currstreak = 1;
        int longeststreak = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            while (str.charAt(i + 1) == currentChar) {
                currstreak++;
                if (i + 1 == str.length()) {
                    break;
                }
                i++;
            }
            if (currstreak > longeststreak) {
                longeststreak = currstreak;
            }
            // System.out.println(currstreak);
            currstreak = 1;
        }
        System.out.println(longeststreak);
    }
}
