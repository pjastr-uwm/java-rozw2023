package zad1;

public class TestMyClass {

    public static void main(String[] args) {
        try {
            MyClass m = new MyClass();
            m.checkAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
