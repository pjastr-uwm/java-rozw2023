package zad23;

public class TestAnimal {

    public static void main(String[] args) {
        Pair<Animal> p1 = new Pair<>(new Animal("AA"), new Dog("RR"));
        System.out.println(findMax(p1));
        Pair<Dog> p2 = new Pair<>(new Dog("TT"), new Dog("BB"));
        System.out.println(findMax(p2));
    }


    public static Animal findMax(Pair<? extends Animal> arg){
        return arg.getFirst();
    }
}
