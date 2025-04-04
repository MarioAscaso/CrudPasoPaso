package organizer;

import student.Student;

import java.util.List;

public class BinarySort {

    public static Student studentSearch(List<Student> studentList, String surname) {
        Student student = null;
        int i = 0;
        int l = studentList.size() - 1;
        boolean found = false;

        while (i <= l && !found) {
            int j = i + (l - i) / 2;

            if (studentList.get(j).getFirstSurname().equals(surname)) {
                student = studentList.get(j);
                found = true;
            }
            if (!found) {
                if (Comparator.isFirstSurnameGreater(studentList.get(j), surname)) {
                    i = j + 1;
                } else {
                    l = j - 1;
                }
            }
        }
        return student;
    }

}
