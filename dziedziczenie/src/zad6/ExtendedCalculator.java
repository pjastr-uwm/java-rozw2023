package zad6;

public class ExtendedCalculator extends Calculator{

    // to nie jest nadpisanie bo inna liczba argumentów
    public int add(int a, int b, int c){
        return a + b + c;
    }
}
