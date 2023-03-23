// Adelina Chau
// Period 2

import java.util.ArrayList;

public class CardGame
{
    public static void main(String[] args)
    {
        ArrayList<CreatureCard> cards = new ArrayList<CreatureCard>();
        cards.add(new CreatureCard(1, 2));
        cards.add(new CreatureCard(2, 2));
        cards.add(new CreatureCard(3, 3));
        cards.add(new CreatureCard(1, 1));
        cards.add(new CreatureCard(2, 2));
        System.out.println("Current Hand 1: " + cards);
        
        // Attack
        cards.get(0).performAttackOn(cards.get(4));
        cards.get(1).performAttackOn(cards.get(2));
        System.out.println("Current Hand 2: " + cards);

        // Remove defeated cards
        ArrayList<CreatureCard> removedCards = removeDefeatedCards(cards);
        System.out.println("Current Hand 3: " + cards);
        System.out.println("Removed Cards: " + removedCards);
    }
    
    public static ArrayList<CreatureCard> removeDefeatedCards(ArrayList<CreatureCard> list)
    {
        ArrayList<CreatureCard> removedCards = new ArrayList<CreatureCard>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isActive()) {
                removedCards.add(list.get(i));
                list.remove(i);
                i--;
            }
        }
        return removedCards;

    }
}