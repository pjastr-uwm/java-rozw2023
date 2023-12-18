package zad1;

public class TestBookDTO {

    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO("Thinking in Java", "Bruce Eckel", 99.99, 2006);
        System.out.println(bookDTO);
        System.out.println(bookDTO.title());
        System.out.println(bookDTO.author());
        System.out.println(bookDTO.price());
        System.out.println(bookDTO.yearOfPublication());
        // bookDTO.title("Thinking in C++"); // error: cannot assign a value to final variable title
        // bookDTO.price() = 199.99; // error: unexpected type
    }
}
