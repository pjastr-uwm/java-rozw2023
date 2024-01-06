package zad15;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jan", 4.5));
        students.add(new Student(24, "Anna", 4.0));
        students.add(new Student(3, "Piotr", 4.0));
        students.add(new Student(41, "Katarzyna", 5.0));
        students.add(new Student(5, "Jakub", 3.0));
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(new AverageGradeComparator().thenComparing(new IdComparator()));
        System.out.println("After sorting");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
