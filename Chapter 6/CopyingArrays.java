public class CopyingArrays {
    public static void main(String[] args) 
    {
        double[] array = {32, 54, 67.5, 29, 35, 47.5};
        double[] array1 = new double[6];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array[0] = 2;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}