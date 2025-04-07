package organizer;

import student.Student;

public class Comparator {

    public static boolean isFirstSurnameGreater(Student s1, Student s2) {
        return s1.getFirstSurname().compareToIgnoreCase(s2.getFirstSurname()) > 0;
    }

    public static boolean isFirstSurnameGreater(Student s1, String s2) {
        return s2.compareToIgnoreCase(s1.getFirstSurname()) > 0;
    }

    public static boolean isSecondSurnameGreater(Student s1, Student s2) {
        return s1.getSecondSurname().compareToIgnoreCase(s2.getSecondSurname()) > 0;
    }

}
