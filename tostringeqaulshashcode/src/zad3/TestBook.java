package zad3;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 100);
        Book b2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 100);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
