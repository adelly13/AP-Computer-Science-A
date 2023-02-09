public class Array2DAlgorithms {
    public static void main (String args[]) {
        checkerboard();
        cage();
        average();
        findPet("Peppy");
    }
    
    public static void checkerboard() {
        // create a 8x8 2D array
        // fill elements alternately with 0s and 1s in a checkerboard pattern
        // print the 2D array
        int[][] board = new int[8][8];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = (row + col) % 2;
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void cage()
    {
        // create a 5x5 2D array
        // fill the first and last columns as well as the first and law row with -1
        // print the 2D array
        int[][] cage = new int[5][5];
        for (int row = 0; row < cage.length; row++) {
            cage[row][0] = -1;
            cage[row][cage.length - 1] = -1;
        }
        for (int row = 0; row < cage.length; row++) {
            for (int col = 0; col < cage[row].length; col++) {
                System.out.print(cage[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void average() {
        // here is a seating chart for students with their final scores
        double[][] scores = {
            {89, 90, 82, 77},
            {74, 70, 81, 89},
            {65, 70, 90, 94}
        };
        
        double size = scores.length * scores[0].length;
        // find the average of the entire class
        // print the average value
        double total = 0;

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[0].length; col++) {
                total += scores[row][col];
            }
        }

        double average = total / size;
        System.out.println(average);
    }

    public static void findPet(String name)
    {
        // each pet has a house/cage where they sleep 
        // and you can find them in the following row/columns
        // where their row number and column number are the indexes of the array
        String[][] names = {
            {"Peppy", "Bella", "Molly", "Alfie"},
            {"Rosie", "Teddy", "Lola", "Millie"},
            {"Luna", "Phoebe", "Jenna", "Sparky"}
        };
        
        // use the parameter name to find the pet in the given 2D array
        // print their house number if found-- which is the row and column index
        // print not found if not found

        boolean found = false;
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[0].length; col++) {
                if (names[row][col].equals(name)) {
                    System.out.println("Found " + name + " at " + row + ", " + col);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
