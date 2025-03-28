package organizer;

import student.Student;

import java.util.List;

public class Interchange {

    public static void swap(List<Student> studentList, Student student1, Student student2) {
        Student student = student1;
        student1 = student2;
        student2 = student;
    }

    public static void swap(Integer[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

}
