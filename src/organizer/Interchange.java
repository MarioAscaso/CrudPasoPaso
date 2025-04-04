package organizer;

import student.Student;

import java.util.List;

public class Interchange {

    public static void swap(List<Student> list, int i, int j) {
        Student temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
