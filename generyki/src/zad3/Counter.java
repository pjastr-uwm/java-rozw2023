package zad3;

import java.util.ArrayList;

public class Counter <T>{

    private ArrayList<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public int getCount() {
        return list.size();
    }
}
