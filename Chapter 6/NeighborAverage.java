public class NeighborAverage
{
    public static void main(String[] args)
    {
        int[][] x = {
            {1, 2, 3},
            {4, 0, 5},
            {6, 7, 8}
        };
        
        System.out.println(neighborAverage(x, 1, 1));
    }
    
    public static double neighborAverage(int[][] values, int row, int column)
    {
        double sum = 0;
        int startRow = row;
        int endRow = row;
        int startCol = column;
        int endCol = column;
        double count = 0;
        if (row > 0)
        {
            startRow = row - 1;
        }
        if (row < values.length - 1)
        {
            endRow = row + 1;
        }
        if (column > 0)
        {
            startCol = column - 1;
        }
        if (column < values[0].length - 1)
        {
            endCol = column + 1;
        }
        for (int i = startRow; i <= endRow; i++)
        {
            for (int j = startCol; j <= endCol; j++)
            {
                sum += values[i][j];
                count++;
            }
        }
        double average = (sum - values[row][column]) / (count - 1);
        return average;
        
    }
}