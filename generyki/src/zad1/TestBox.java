package zad1;

public class TestBox {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setElement("Hello World!");
        System.out.println(box.getElement());
    }
}
