import java.util.ArrayList;

public class Arrays2D {
    public static void main(String[] args)
    {
        String[][] grid = {
            {"Ann", "Bob", "Cal", "Dan"},
            {"Cindy", "Emily", "Bob", "Dan"},
            {"Josh", "Bob", "Ann", "Frank"}
        };
        
        ArrayList<String> duplicateNames = findDuplicates(grid);
        System.out.println(duplicateNames);
    }
    public static int countAppearanceOf(String[][] array2D, String word) {
        int count = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j].equals(word)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static ArrayList<String> findDuplicates(String[][] array2D) {
        ArrayList<String> duplicates = new ArrayList<String>();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                boolean found = false;
                for (int k = 0; k < duplicates.size(); k++) {
                    if (array2D[i][j] == duplicates.get(k)) {
                        found = true;
                    }
                }
                if (!found) {
                    int count = countAppearanceOf(array2D, array2D[i][j]);
                    if (count > 1) {
                        duplicates.add(array2D[i][j]);
                    }
                }
            }
        }
        return duplicates;
    }
}
