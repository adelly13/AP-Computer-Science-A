import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntroduction2 {
    public static void main(String[] args) {
        // A
        ArrayList<Integer> rolls = rollDice(20);
        System.out.println(rolls);

        // B
        ArrayList<Double> numbers = fillFromInput();
        System.out.println(numbers);

        // C
        ArrayList<Double> c = new ArrayList<Double>();
        c.add(4.5);
        c.add(6.8);
        c.add(2.1);
        System.out.println("Average value: " + average(c));

        // D
        ArrayList<String> d = new ArrayList<String>();
        d.add("Ben");
        d.add("Tom");
        d.add("Jerry");
        System.out.println(count(d, 4));

        // E
        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(10);
        e.add(1);
        e.add(4);
        e.add(8);
        e.add(-3);
        System.out.println(findMin(e));

        // F
        ArrayList<String> f = new ArrayList<String>();
        f.add("Ben");
        f.add("Adelina");
        f.add("Rohan");
        f.add("Valerie");
        f.add("Aashna");
        f.add("Tom");
        f.add("Jerry");
        System.out.println(findGreaterThan(f, 5));

        // G
        ArrayList<Integer> g = new ArrayList<Integer>();
        g.add(1);
        g.add(2);
        g.add(3);
        g.add(4);
        System.out.println(hasDuplicates(g));

        // H
        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(-4);
        System.out.println(allPositive(h));

        // I
        ArrayList<String> i = new ArrayList<String>();
        i.add("Ben");
        i.add("Adelina");
        i.add("Rohan");
        i.add("Valerie");
        i.add("Aashna");
        i.add("Tom");
        i.add("Jerry");
        System.out.println(linearSearch(i, "Shannon"));

        // J
        ArrayList<Double> j = new ArrayList<Double>();
        j.add(1.0);
        j.add(2.0);
        j.add(3.0);
        j.add(4.0);
        j.add(5.0);
        j.add(6.0);
        System.out.println(binarySearch(j, 6.0));

        // K
        ArrayList<String> k = new ArrayList<String>();
        k.add("Ben");
        k.add("Adelina");
        k.add("Rohan");
        k.add("Valerie");
        k.add("Aashna");
        k.add("Tom");
        k.add("Jerry");
        swapFirstLast(k);
        System.out.println(k);

        // L
        ArrayList<String> l = new ArrayList<String>();
        l.add("Ben");
        l.add("Adelina");
        l.add("Rohan");
        l.add("Valerie");
        l.add("Aashna");
        l.add("Tom");
        l.add("Jerry");
        reverse(l);
        System.out.println(l);

        // M
        ArrayList<String> m = new ArrayList<String>();
        m.add("Ben");
        m.add("Adelina");
        m.add("Rohan");
        m.add("Valerie");
        m.add("Aashna");
        m.add("Tom");
        m.add("Jerry");
        removeNamesLessThanLengthX(m, 4);
        System.out.println(m);

        // N
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(2);
        n.add(3);
        n.add(5);
        n.add(7);
        n.add(11);
        n.add(13);
        rotateElementsLeft(n);
        System.out.println(n);
        
        // O
        ArrayList<String> o = new ArrayList<String>();
        o.add("A");
        o.add("B");
        o.add("F");
        o.add("F");
        o.add("C");
        o.add("A");
        o.add("B");
        o.add("D");
        o.add("C");
        o.add("B");
        o.add("B");
        o.add("B");
        o.add("B");
        o.add("D");
        o.add("F");
        o.add("F");
        o.add("F");
        o.add("F");
        o.add("F");
        o.add("D");
        o.add("C");
        o.add("A");
        longestRun(o);
    }

    // A
    public static ArrayList<Integer> rollDice(int numberOfRolls) {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < numberOfRolls; i++) {
            rolls.add((int) (Math.random() * 6 + 1));
        }
        return rolls;
    }

    // B
    public static ArrayList<Double> fillFromInput() {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextDouble()) {
            double number = input.nextDouble();
            numbers.add(number);
        }
        return numbers;
    }

    // C
    public static double average(ArrayList<Double> values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    // D
    public static int count(ArrayList<String> names, int n) {
        int count = 0;
        for (String name : names) {
            if (name.length() > n) {
                count++;
            }
        }
        return count;
    }

    // E
    public static int findMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    
    // F
    public static String findGreaterThan(ArrayList<String> names, int n) {
        String result = "";
        for (String name : names) {
            if (name.length() > n) {
                result = name;
                return result;
            }
        }
        return result;
    }

    // G
    public static boolean hasDuplicates(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // H
    public static boolean allPositive(ArrayList<Integer> numbers) {
        boolean positive = true;
        for (int number : numbers) {
            if (number < 0) {
                positive = false;
            }
        }
        return positive;
    }

    // I
    public static int linearSearch(ArrayList<String> names, String searched) {
        int idx = -1;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(searched)) {
                idx = i;
                return idx;
            }
        }
        return idx;
    }

    // J
    public static int binarySearch(ArrayList<Double> nums, double searched) {
        int low = 0;
        int high = nums.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (searched == nums.get(mid)) {
                return mid;
            }
            if (searched < nums.get(mid)) {
                high = mid - 1;
            } else if (searched > nums.get(mid)) {
                low = mid + 1;
            }
        }
        return -1;
    }

    // K
    public static void swapFirstLast(ArrayList<String> names) {
        String first = names.get(0);
        String last = names.get(names.size() - 1);
        names.set(0, last);
        names.set(names.size() - 1, first);
    }

    // L
    public static void reverse(ArrayList<String> names) {
        for (int i = 0; i < names.size() / 2; i++) {
            String temp = names.get(i);
            names.set(i, names.get((names.size()-1) - i));
            names.set(names.size()-1-i, temp);
        }
    }

    // M
    public static void removeNamesLessThanLengthX(ArrayList<String> names, int x) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() < x) {
                names.remove(i);
                i--;
            }
        }
    }

    // N
    public static void rotateElementsLeft(ArrayList<Integer> nums) {
        int first = nums.get(0);
        for (int i = 0; i < nums.size()-1; i++) {
            nums.set(i, nums.get(i+1));
        }
        nums.set(nums.size()-1, first);
    }

    // O
    public static void longestRun(ArrayList<String> grades) {
        String prevGrade = grades.get(0);
        String longestGrade = grades.get(0);
        int longestStreak = 1;
        int currStreak = 1;
        for (int i = 1; i < grades.size(); i++) {
            String currGrade = grades.get(i);
            if (currGrade.equals(prevGrade)) {
                currStreak++;
            } else {
                if (currStreak > longestStreak) {
                    longestStreak = currStreak;
                    longestGrade = prevGrade;
                }
                currStreak = 1;
            }
            prevGrade = currGrade;
        }
        System.out.println(longestGrade + " " + longestStreak);
    }
}