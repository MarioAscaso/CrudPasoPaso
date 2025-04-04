package organizer;

import student.Student;

import java.util.List;

public class Organizer {

    public static List<Student> sortByBubble(List<Student> studentList) {

        Comparator comparator = new Comparator();
        Student student;

        int numberOfStudents = studentList.size();
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfStudents - 1; j++) {

                if (studentList.get(j).getFirstSurname().equals(studentList.get(j + 1).getFirstSurname())) {
                    for (int x = 0; x < numberOfStudents; x++) {
                        for (int y = 0; y < numberOfStudents - 1; y++) {
                            if (!comparator.isFirstWordGreaterThanTheSecondB(studentList.get(y), (studentList.get(y + 1)))) {
                                Interchange.swap(studentList, studentList.get(y), studentList.get(y + 1));
                            }
                        }
                    }
                }
                if (!comparator.isFirstWordGreaterThanTheSecondA(studentList.get(j), (studentList.get(j + 1)))) {
                    Interchange.swap(studentList, studentList.get(j), studentList.get(j + 1));
                }
            }
        }
        return studentList;
    }

}
