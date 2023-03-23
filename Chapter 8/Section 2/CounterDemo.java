public class CounterDemo {
    public static void main (String[] args) {
        Counter tally = new Counter();
        tally.count();
        tally.count();
        int result = tally.getValue();
        System.out.println(result);
    }
}
