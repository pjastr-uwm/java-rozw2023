package zad3;

public class Test3 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        try {
            myClass.sprawdzFormatDanych("test@test.pl");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println(e.getMessage());
        }
    }
}
