package zad3;

public class TestCounter {

    public static void main(String[] args) {
        Counter<String> counter = new Counter<>();
        counter.add("Ala");
        counter.add("ma");
        counter.add("kota");
        System.out.println(counter.getCount());
        Counter<Double> counter2 = new Counter<>();
        counter2.add(1.0);
        counter2.add(-2.4);
        counter2.add(3.14);
        counter2.add(33.4);
        System.out.println(counter2.getCount());
    }
}
