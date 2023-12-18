package zad2;

public class TestPerson {

    public static void main(String[] args) {
        Address address = new Address("Kwiatowa", "1", "00-100", "Warszawa");
        Person person = new Person("Jan", "Kowalski", address);
        System.out.println(person);
        Person person2 = new Person("Jan", "Kowalski", new Address("Kwiatowa", "1", "00-100", "Warszawa"));
        System.out.println(person2);
        System.out.println(person.equals(person2));
    }
}
