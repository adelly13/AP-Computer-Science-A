import java.util.Scanner;

public class AnimalArray 
{ 
    public static void main(String[] args) 
    { 
        // String[] animals = {"panda", "dog", "cats"};
        // for (String animal : animals) {
        //     System.out.println(animal);
        // }

        String[] animals = new String[1000000];

        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (sc.hasNext()) {
            if (sc.next().equals("quit")) {
                break;
            }
            animals[counter] = sc.next();
        }

        for (int i = 0; i < counter; i++) {
            System.out.print(animals[i]);
            // System.out.print(i);
            if (i != (animals.length-1)) {
                System.out.print(", ");
            } else {
                System.out.print("\n");
            }
        }
    }
}