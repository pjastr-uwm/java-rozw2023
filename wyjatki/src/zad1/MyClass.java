package zad1;

public class MyClass {

    public void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be greater than or equal to 18");
        }
    }
}
