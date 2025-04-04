package organizer;

import student.Student;

/* Duplicated code */
public class Comparator {

    // Devuelve true si s1 debe ir DESPUÉS de s2
    public boolean isFirstSurnameGreater(Student s1, Student s2) {
        return s1.getFirstSurname().compareToIgnoreCase(s2.getFirstSurname()) > 0;
    }

    public boolean isSecondSurnameGreater(Student s1, Student s2) {
        return s1.getSecondSurname().compareToIgnoreCase(s2.getSecondSurname()) > 0;
    }


}
