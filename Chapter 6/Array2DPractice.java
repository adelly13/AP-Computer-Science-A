public class Array2DPractice
{
    public static void main(String[] args)
    {
        int[][] array = new int[4][3];
        System.out.println("Number of rows: " + array.length);
        System.out.println("Number of columns: " + array[0].length);
        array[0][0] = 1;
        array[0][2] = 3;
        array[1][1] = 2;
        array[3][1] = 4;
        array[1][2] = 5;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}