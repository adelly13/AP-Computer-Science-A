// Adelina Chau
// Period 2

import java.util.Arrays;

public class DiceRolling {
    public static void main (String[] args) {
        int[] rolls = rollDice(20);
        // int[] rolls = {4, 1, 1, 5, 6, 5, 6, 3, 6, 6, 6, 6, 4, 5, 2, 2, 6, 2, 1, 5};
        System.out.println(Arrays.toString(rolls));

        double average = averageRoll(rolls);
        System.out.printf("Average: %.2f\n", average);

        int mostRolled = mostRolledValue(rolls);
        System.out.printf("Most Rolled Value: %d\n", mostRolled);

        longestRun(rolls);

    }

    public static int[] rollDice(int numberOfRolls) {
        int[] rolls = new int[numberOfRolls];
        for (int i = 0; i < numberOfRolls; i++) {
            rolls[i] = (int) (Math.random() * 6 + 1);
        }
        return rolls;
    }

    public static double averageRoll(int[] rolls) {
        double total = 0;
        for (int roll : rolls) {
            total += roll;
        }
        double average = total/rolls.length;
        return average;
    }

    public static int mostRolledValue(int[] rolls) {
        int[] rollCount = new int[6];
        for (int roll : rolls) {
            rollCount[roll-1]++;
        }
        int max = rollCount[0];
        int value = 1;
        for (int i = 0; i < rollCount.length; i++) {
            int count = rollCount[i];
            if (count > max) {
                max = count;
                value = i+1;
            }
        }
        return value;
    }

    public static void longestRun(int[] rolls) {
        int prevRoll = rolls[0];
        int streak = 1;
        int longestStreak = 0;
        int longestRunVal = 0;
        for (int i = 1; i < rolls.length; i++) {
            int currRoll = rolls[i];
            if (currRoll == prevRoll) {
                streak++;
            } else {
                if (longestStreak < streak) {
                    longestStreak = streak;
                    longestRunVal = prevRoll;
                }
                streak = 1;
            }
            prevRoll = currRoll;
        }
        System.out.printf("Longest Run Roll: %d, Streak: %d\n", longestRunVal, longestStreak);

    }
}
