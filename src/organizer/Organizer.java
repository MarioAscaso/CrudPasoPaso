package organizer;

import student.Student;

import java.util.List;

public class Organizer {

    public static List<Student> sortListAlphabetically(List<Student> studentList) {
        Comparator comparator = new Comparator();
        int n = studentList.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Student current = studentList.get(j);
                Student next = studentList.get(j + 1);

                if (comparator.isFirstSurnameGreater(current, next)) {
                    Interchange.swap(studentList, j, j + 1);
                } else if (current.getFirstSurname().equalsIgnoreCase(next.getFirstSurname())
                           && comparator.isSecondSurnameGreater(current, next)) {
                    Interchange.swap(studentList, j, j + 1);
                }
            }
        }
        return studentList;
    }
}

