/**
   Represents a single creature card in a children's card game.
*/
public class CreatureCard
{
   private int attack;
   private int health;
   
   private int cardNumber;
   private static int lastAssignedCardNumber = 100;

   /**
      Gets how many cards have been created by the class.
      @return the number of cards created
   */
   public static int getNumberOfCards()
   {
      return lastAssignedCardNumber - 100;
   }

   
   /**
      Constructs a creature card with given attack and health values.
      @param attack the card's attack value 
      @param health the card's starting health value
   */
   public CreatureCard(int attack, int health)
   {
      this.attack = attack;
      this.health = health;
      
      lastAssignedCardNumber++;
      cardNumber = lastAssignedCardNumber;
   }
   
   
   /**
      Represents a card as attack value over the current health value.
      @return a String denoting attack / health
   */
   public String toString()
   {
      return "(#" + cardNumber + ") " + attack + "/" + health;
   }
   
   
   /**
      A card is considered active if a card’s health value is greater than 0.
      @return true if the card is active and false otherwise
   */
   public boolean isActive()
   {
      return health > 0;
   }
   
   
   /**
      Performs an attack action on another creature card-- an attack consists of both creature cards
      losing a set amount of health points based on the opposing card's attack value.
      @param other is the other card that is being attacked
   */
   public void performAttackOn(CreatureCard other)
   {
      this.health = this.health - other.attack;
      other.health = other.health - this.attack;
   }
}