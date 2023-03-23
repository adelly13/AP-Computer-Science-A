public class main {
    public static void main (String[] args) {
        Frog kermit = new Frog(3);
        kermit.hopBack();
        System.out.println(kermit.getPosition());

        Frog toad = new Frog();
        toad.hop();
        toad.hop();
        toad.hop();
        System.out.println(toad.getPosition());

        Frog bogart = new Frog(2);
        bogart.hopBack();
        bogart.hopBack();
        bogart.hopBack();
        bogart.hopBack();
        bogart.hopBack();
        System.out.println(bogart.getPosition());
    } 
}
