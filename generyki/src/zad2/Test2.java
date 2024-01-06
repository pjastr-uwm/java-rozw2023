package zad2;

public class Test2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.isEquals(1, 1));
        System.out.println(myClass.isEquals(1, 2));
        System.out.println(myClass.isEquals("a", "a"));
    }
}
