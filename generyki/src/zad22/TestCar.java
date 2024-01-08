package zad22;

public class TestCar {

    public static void main(String[] args) {
        System.out.println(compareObjects(new Car(), new ElectricCar()));
        System.out.println(compareObjects(new Car(), new Car()));
    }


    public static <T extends Car> boolean compareObjects(T object1, T object2){
        return object1.getClass() == object2.getClass();
    }
}
