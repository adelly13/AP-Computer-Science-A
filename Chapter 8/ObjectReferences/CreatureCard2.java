public class CreatureCard2 {
    private int attack;
    private int health;
    private int cardNumber;
    private static int lastAssignedCardNumber = 100;

    public static int getNumberOfCards() {
        return lastAssignedCardNumber - 100;
    }

    public CreatureCard2(int attack, int health) {
        attack = attack;
        health = health;

        lastAssignedCardNumber++;
        cardNumber = lastAssignedCardNumber;
    }

    public String toString() {
        return "(#" + cardNumber + ") " + attack + "/" + health;
    }

    public boolean isActive() {
        return health > 0;
    }

    public void performAttackOn (CreatureCard2 other) {
        this.health = this.health - other.attack;
        other.health = other.health - this.attack;
    }
}