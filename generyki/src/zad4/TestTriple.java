package zad4;

public class TestTriple {

    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Hello", 42, 3.14);
        System.out.println(triple);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
    }
}
