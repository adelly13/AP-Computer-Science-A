public class Fighter
{
    private int hurt;
    private int armor;
    
    public Fighter () {
        hurt = 0;
        armor = 0;
    }

    public Fighter (int armorPoints) {
        armor = armorPoints;
    }
    
    public void hit (int damage) {
        if ((damage > armor)) {
            hurt += (damage - armor);
        }
    }

    public void donArmor(int armorValue) {
        armor = armorValue;
    }

    public void healing() {
        hurt = 0;
    }

    public int getHurt() {
        return hurt;
    }
}