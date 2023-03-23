public class main {
    public static void main (String[] args) {
        Fighter sashank = new Fighter();
        System.out.println(sashank.getHurt());
        sashank.hit(4);
        sashank.hit(3);
        System.out.println(sashank.getHurt());
        sashank.donArmor(5);
        sashank.hit(4);
        sashank.hit(8);
        sashank.hit(5);
        System.out.println(sashank.getHurt());
        sashank.healing();
        System.out.println(sashank.getHurt());
        sashank.donArmor(8);
        sashank.hit(10);
        System.out.println(sashank.getHurt());
    }
}
