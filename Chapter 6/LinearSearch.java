public class LinearSearch
{
    public static void main(String[] args)
    {
        double[] values = {32, 54, 67.5, 29, 35};
        double searchedValue = 100;
        boolean found = false;
        int counter = 0;
        
        while (found == false && counter < values.length) {
            if (searchedValue == values[counter]) {
                System.out.println(counter);
                found = true;
            }
            else {
                counter++;
            }
        }
        if (found == false) {
            System.out.println("Not found");
        }
        
    }
}