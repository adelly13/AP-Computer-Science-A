import java.util.ArrayList;

public class ArrayListIntroduction 
{ 
   public static void main(String[] args)
   {
        // A) create an ArrayList and add 4 names
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ann");
        names.add("Cindy");
        names.add("Bob");
        names.add("Carolyn");
        
        // B) print the ArrayList
        System.out.println(names);
        
        // C) print the number of items of the ArrayList
        System.out.println(names.size());

        
        // D) use a loop to print each name on a new line with the index+1 in front
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i+1) + " " + names.get(i));
        }
        
        // E) use an enhanced for loop to print each name on a new line
        for (String name : names) {
            System.out.println(name);
        }
        
        // F) try the code on Canvas and see what the ArrayList looks like after
        names.remove(0);
        names.set(0, "Bill");
        names.add(1, "Cathy");
        System.out.println(names);

        // G) try the code on Canvas and see what the ArrayList looks like after
        names.remove(names.size()-1);
        names.add("Henry");
        names.set(2, "John");
        names.remove("Cathy");
        System.out.println(names);

        // H) try the code on Canvas and see what the ArrayLists look like after
        ArrayList<String> friends = names;
        friends.add("Bob");
        friends.add("Ann");
        names.remove(0);
        System.out.println("Names: " + names);
        System.out.println("Friends: " + friends);

        // I) try the code on Canvas and see what the ArrayLists look like after
        ArrayList<String> enemies = new ArrayList<String>(friends);
        enemies.set(0, "EVIL " + enemies.get(0));
        enemies.remove(1);
        enemies.add(0, "UNKNOWN");
        enemies.remove(enemies.size()-1);
        friends.remove(2);
        System.out.println("Friends: " + friends);
        System.out.println("Enemies: " + enemies);

        // J) print the list of names in reverse order
        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        // K) print only names who start with letter A
        for (String name : names) {
            if (name.charAt(0) == 'A') {
                System.out.println(name);
            }
        }
    }
}